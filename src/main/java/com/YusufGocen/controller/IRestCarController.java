package com.YusufGocen.controller;

import com.YusufGocen.dto.DtoCar;
import com.YusufGocen.dto.DtoCarIU;

public interface IRestCarController {
	
	public RootEntity<DtoCar>saveCar(DtoCarIU dtoCarIU);

}
