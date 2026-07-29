package com.YusufGocen.controller;

import com.YusufGocen.dto.DtoGallerist;
import com.YusufGocen.dto.DtoGalleristIU;

public interface IRestGalleristController {

	public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}
