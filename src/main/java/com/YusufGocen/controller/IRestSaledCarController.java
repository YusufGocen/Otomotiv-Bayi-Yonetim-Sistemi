package com.YusufGocen.controller;

import com.YusufGocen.dto.DtoCarSaled;
import com.YusufGocen.dto.DtoSaledCarIU;

public interface IRestSaledCarController {
	public RootEntity<DtoCarSaled> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
