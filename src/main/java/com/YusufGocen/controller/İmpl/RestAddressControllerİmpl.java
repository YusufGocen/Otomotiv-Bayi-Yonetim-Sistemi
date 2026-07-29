package com.YusufGocen.controller.İmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.YusufGocen.controller.IRestAddressController;
import com.YusufGocen.controller.RestBaseController;
import com.YusufGocen.controller.RootEntity;
import com.YusufGocen.dto.DtoAddress;
import com.YusufGocen.dto.DtoAddressIU;
import com.YusufGocen.service.IAddressService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/address")
@Tag(name = "Adres İşlemleri",description = "Adres kayıt ve yönetim işlemleri")
public class RestAddressControllerİmpl extends RestBaseController implements IRestAddressController{
	
	@Autowired
	private IAddressService addressService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoAddress> saveAddress(@Valid @RequestBody DtoAddressIU dtoAddressIU) {
		return ok(addressService.saveAddress(dtoAddressIU));
	}
	
}
