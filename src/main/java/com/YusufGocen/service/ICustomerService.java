package com.YusufGocen.service;

import com.YusufGocen.dto.DtoCustomer;
import com.YusufGocen.dto.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
