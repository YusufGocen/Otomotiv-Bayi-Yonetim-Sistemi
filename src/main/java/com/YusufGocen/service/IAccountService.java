package com.YusufGocen.service;

import com.YusufGocen.dto.DtoAccount;
import com.YusufGocen.dto.DtoAccountIU;

public interface IAccountService {
	
	public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);

}
