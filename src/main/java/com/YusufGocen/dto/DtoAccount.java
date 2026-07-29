package com.YusufGocen.dto;

import java.math.BigDecimal;

import com.YusufGocen.enums.CurrencyType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoAccount extends DtoBase{

	private String accountNo;
	
	private String iban;

	private BigDecimal amount;

	private CurrencyType currencyType;
}
