package com.YusufGocen.service;

import com.YusufGocen.dto.DtoAddress;
import com.YusufGocen.dto.DtoAddressIU;

public interface IAddressService {

	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
