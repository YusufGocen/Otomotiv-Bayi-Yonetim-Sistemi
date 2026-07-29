package com.YusufGocen.controller;

import com.YusufGocen.dto.AuthRequest;
import com.YusufGocen.dto.AuthResponse;
import com.YusufGocen.dto.DtoUser;
import com.YusufGocen.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse>authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
