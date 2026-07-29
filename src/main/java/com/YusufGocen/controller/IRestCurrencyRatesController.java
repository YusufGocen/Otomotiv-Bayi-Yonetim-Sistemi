package com.YusufGocen.controller;

import com.YusufGocen.dto.CurrencyRatesResponse;

public interface IRestCurrencyRatesController {

	public RootEntity< CurrencyRatesResponse>getCurrencyRates(String startDate,String endDate);
}
