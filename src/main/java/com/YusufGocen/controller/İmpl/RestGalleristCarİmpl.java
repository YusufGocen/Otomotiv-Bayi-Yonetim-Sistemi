package com.YusufGocen.controller.İmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.YusufGocen.controller.IRestGalleristCarController;
import com.YusufGocen.controller.RestBaseController;
import com.YusufGocen.controller.RootEntity;
import com.YusufGocen.dto.DtoGalleristCar;
import com.YusufGocen.dto.DtoGalleristCarIU;
import com.YusufGocen.service.IGalleristCarService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/gallerist-car")
@Tag(name = "Bayi Araç İşlemleri",description = "Bayiye ait araçların yönetimi")
public class RestGalleristCarİmpl extends RestBaseController implements IRestGalleristCarController{

	@Autowired
	private IGalleristCarService galleristCarService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoGalleristCar> saveGalleristCar(@Valid @RequestBody DtoGalleristCarIU dtoGalleristCarIU) {
		return ok(galleristCarService.saveGalleristCar(dtoGalleristCarIU));
	}

}
