package com.YusufGocen.controller;

import com.YusufGocen.dto.DtoAccount;
import com.YusufGocen.dto.DtoAccountIU;

public interface IRestAccountController {

	public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
	
}
