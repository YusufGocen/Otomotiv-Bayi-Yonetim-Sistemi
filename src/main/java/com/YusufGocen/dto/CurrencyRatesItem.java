package com.YusufGocen.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyRatesItem {

	@JsonProperty("Tarih")
	private String date;
	
	@JsonProperty("TP_DK_USD_S_YTL")
	private String usd;
	
}
