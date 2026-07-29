package com.YusufGocen.controller.İmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.YusufGocen.controller.IRestAuthenticationController;
import com.YusufGocen.controller.RestBaseController;
import com.YusufGocen.controller.RootEntity;
import com.YusufGocen.dto.AuthRequest;
import com.YusufGocen.dto.AuthResponse;
import com.YusufGocen.dto.DtoUser;
import com.YusufGocen.dto.RefreshTokenRequest;
import com.YusufGocen.service.IAuthenticationService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@Tag(name = "Kimlik Doğrulama",description = "Kullanıcı giriş, kayıt ve token yenileme işlemleri")
public class RestAuthenticationControllerİmpl extends RestBaseController implements IRestAuthenticationController{

	@Autowired
	private IAuthenticationService authenticationService;
	
	@PostMapping("/register")
	@Override
	public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest input) {
		
		return ok(authenticationService.register(input));
	}
	
	@PostMapping("/authenticate")
	@Override
	public RootEntity<AuthResponse> authenticate(@Valid @RequestBody AuthRequest input) {
		return ok(authenticationService.authenticate(input));
	}

	@PostMapping("/refreshToken")
	@Override
	public RootEntity<AuthResponse> refreshToken(@Valid @RequestBody RefreshTokenRequest input) {
		return ok(authenticationService.refreshToken(input));
	}

	
	
}
