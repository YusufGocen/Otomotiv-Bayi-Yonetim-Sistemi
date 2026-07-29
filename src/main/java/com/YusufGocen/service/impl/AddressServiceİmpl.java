package com.YusufGocen.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YusufGocen.dto.DtoAddress;
import com.YusufGocen.dto.DtoAddressIU;
import com.YusufGocen.model.Address;
import com.YusufGocen.repository.AddressRepository;
import com.YusufGocen.service.IAddressService;

@Service
public class AddressServiceİmpl implements IAddressService{
	
	@Autowired
	private AddressRepository addressRepository;

	private Address createAddress(DtoAddressIU dtoAddressIU) {
		Address address =new Address();
		address.setCreateTime(new Date());
		
		BeanUtils.copyProperties(dtoAddressIU, address);
		return address;
	}
	
	@Override
	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU) {
		
		DtoAddress dtoAddress=new DtoAddress();
		
		Address savedAddress=addressRepository.save(createAddress(dtoAddressIU));
		
		BeanUtils.copyProperties(savedAddress, dtoAddress);
		
		return dtoAddress;
	}
	
}
