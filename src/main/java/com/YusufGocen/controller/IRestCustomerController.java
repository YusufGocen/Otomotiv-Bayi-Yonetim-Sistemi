package com.YusufGocen.controller;

import com.YusufGocen.dto.DtoCustomer;
import com.YusufGocen.dto.DtoCustomerIU;

public interface IRestCustomerController {

	public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
