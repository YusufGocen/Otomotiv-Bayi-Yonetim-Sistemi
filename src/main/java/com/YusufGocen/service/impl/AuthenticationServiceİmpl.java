package com.YusufGocen.service.impl;

import java.sql.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.YusufGocen.dto.AuthRequest;
import com.YusufGocen.dto.AuthResponse;
import com.YusufGocen.dto.DtoUser;
import com.YusufGocen.dto.RefreshTokenRequest;
import com.YusufGocen.exception.BaseException;
import com.YusufGocen.exception.ErrorMessage;
import com.YusufGocen.exception.MessageType;
import com.YusufGocen.jwt.JWTService;
import com.YusufGocen.model.RefreshToken;
import com.YusufGocen.model.User;
import com.YusufGocen.repository.RefreshTokenRepository;
import com.YusufGocen.repository.UserRepository;
import com.YusufGocen.service.IAuthenticationService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class AuthenticationServiceİmpl implements IAuthenticationService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private AuthenticationProvider authenticationProvider;
	
	@Autowired
	private JWTService jwtService;
	
	@Autowired
	private RefreshTokenRepository refreshTokenRepository;
	
	private User createUser(AuthRequest input) {
		User user=new User();
		user.setCreateTime(new Date(0));
		user.setUsername(input.getUsername());
		user.setPassword(passwordEncoder.encode(input.getPassword()));
		
		return user;
	}
	
	private RefreshToken createRefreshToken(User user) {
		RefreshToken refreshToken=new RefreshToken();
		refreshToken.setCreateTime(new Date(0));
		refreshToken.setExpiredDate(new Date(System.currentTimeMillis()+ 1000*60*60*4));
		refreshToken.setRefreshToken(UUID.randomUUID().toString());
		refreshToken.setUser(user);
		
		return refreshToken;
		
	}
	
	@Override
	public DtoUser register(AuthRequest input) {
		
		DtoUser dtoUser=new DtoUser();
		
		User savedUser=userRepository.save(createUser(input));
		
		BeanUtils.copyProperties(savedUser, dtoUser);
		
		return dtoUser;
	}

	@Override
	public AuthResponse authenticate(AuthRequest input) {
		
		try {
			UsernamePasswordAuthenticationToken authenticationToken=
					new UsernamePasswordAuthenticationToken(input.getUsername(), input.getPassword());
			
			authenticationProvider.authenticate(authenticationToken);
			
			Optional<User> optUser=userRepository.findByUsername(input.getUsername());
			
			String accessToken=jwtService.generateToken(optUser.get());
			RefreshToken savedRefreshToken=refreshTokenRepository.save(createRefreshToken(optUser.get()));
			
			return new AuthResponse(accessToken,savedRefreshToken.getRefreshToken());
			
		} catch (Exception e) {
			throw new BaseException(new ErrorMessage(MessageType.USERNAME_OR_PASSWORD_INVALID , e.getMessage()));
		}
	}
	

	@Override
	public AuthResponse refreshToken(RefreshTokenRequest input) {
		Optional<RefreshToken> optRefreshToken=refreshTokenRepository.findByRefreshToken(input.getRefreshToken());
		
		if (optRefreshToken.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST , input.getRefreshToken()));
		}
		
		User user =optRefreshToken.get().getUser();
		String accessToken=jwtService.generateToken(user);
		RefreshToken savedRefreshToken=refreshTokenRepository.save(createRefreshToken(user));
		
		
		
		return new AuthResponse(accessToken,savedRefreshToken.getRefreshToken());
	}



}
