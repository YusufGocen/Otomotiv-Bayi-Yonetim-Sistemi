package com.YusufGocen.service;

import com.YusufGocen.dto.DtoGalleristCar;
import com.YusufGocen.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
