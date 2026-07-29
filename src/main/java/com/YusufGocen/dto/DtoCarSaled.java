package com.YusufGocen.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoCarSaled extends DtoBase{
	
	private DtoCustomer dtoCustomer;
	
	private DtoGallerist dtoGallerist;
	
	private DtoCar dtoCar;
}
