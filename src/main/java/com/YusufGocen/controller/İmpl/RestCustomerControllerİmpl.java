package com.YusufGocen.controller.İmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.YusufGocen.controller.IRestCustomerController;
import com.YusufGocen.controller.RestBaseController;
import com.YusufGocen.controller.RootEntity;
import com.YusufGocen.dto.DtoCustomer;
import com.YusufGocen.dto.DtoCustomerIU;
import com.YusufGocen.service.ICustomerService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/customer")
@Tag(name = "Müşteri İşlemleri", description = "Müşteri yönetimi için kullanılan endpointler")
public class RestCustomerControllerİmpl extends RestBaseController implements IRestCustomerController{

	@Autowired
	private ICustomerService customerService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoCustomer> saveCustomer(@Valid @RequestBody DtoCustomerIU dtoCustomerIU) {
		
		
		return ok(customerService.saveCustomer(dtoCustomerIU));
	}



}
