package com.YusufGocen.service;

import com.YusufGocen.dto.AuthRequest;
import com.YusufGocen.dto.AuthResponse;
import com.YusufGocen.dto.DtoUser;
import com.YusufGocen.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
