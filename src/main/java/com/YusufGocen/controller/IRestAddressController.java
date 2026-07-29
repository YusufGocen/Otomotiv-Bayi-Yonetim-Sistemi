package com.YusufGocen.controller;

import com.YusufGocen.dto.DtoAddress;
import com.YusufGocen.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
	
}
