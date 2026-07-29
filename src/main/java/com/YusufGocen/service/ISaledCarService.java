package com.YusufGocen.service;

import com.YusufGocen.dto.DtoCarSaled;
import com.YusufGocen.dto.DtoSaledCarIU;

public interface ISaledCarService {

	public DtoCarSaled buyCar(DtoSaledCarIU dtoSaledCarIU);
}
