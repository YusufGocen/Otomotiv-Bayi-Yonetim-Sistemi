package com.YusufGocen.controller.İmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.YusufGocen.controller.IRestAccountController;
import com.YusufGocen.controller.RestBaseController;
import com.YusufGocen.controller.RootEntity;
import com.YusufGocen.dto.DtoAccount;
import com.YusufGocen.dto.DtoAccountIU;
import com.YusufGocen.service.IAccountService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/account")
@Tag(name = "Hesap İşlemleri",description = "Hesap bilgileri ve finansal kayıt işlemleri")
public class RestAccountControllerImpl extends RestBaseController implements IRestAccountController{

	@Autowired
	private IAccountService accountService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoAccount> saveAccount(@Valid @RequestBody DtoAccountIU dtoAccountIU) {
		return ok(accountService.saveAccount(dtoAccountIU));
	}

}
