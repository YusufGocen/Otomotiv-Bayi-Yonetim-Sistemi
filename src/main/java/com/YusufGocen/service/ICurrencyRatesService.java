package com.YusufGocen.service;

import com.YusufGocen.dto.CurrencyRatesResponse;

public interface ICurrencyRatesService {

	public CurrencyRatesResponse getCurrencyRates(String startDate,String endDate);
}
