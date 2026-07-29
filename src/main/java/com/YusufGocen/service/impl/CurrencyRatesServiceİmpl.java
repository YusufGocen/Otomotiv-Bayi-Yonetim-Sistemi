package com.YusufGocen.service.impl;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.YusufGocen.dto.CurrencyRatesResponse;
import com.YusufGocen.exception.BaseException;
import com.YusufGocen.exception.ErrorMessage;
import com.YusufGocen.exception.MessageType;
import com.YusufGocen.service.ICurrencyRatesService;

@Service
public class CurrencyRatesServiceİmpl implements ICurrencyRatesService{

	@Override
	public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate) {
		
		String rootUrl="https://evds3.tcmb.gov.tr/igmevdsms-dis/";
		String series="TP.DK.USD.S.YTL";
		String type="json";
		
		String endpoint=rootUrl+"series="+series+"&startDate="+startDate+"&endDate="+endDate+"&type="+type;
		
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.set("key", "8Hywi0T3BQ");
		
		HttpEntity<?>httpEntity=new HttpEntity<>(httpHeaders);
		
		RestTemplate restTemplate=new RestTemplate();

		
		try {
			
			ResponseEntity<CurrencyRatesResponse> response= restTemplate.exchange(endpoint, HttpMethod.GET , httpEntity,new ParameterizedTypeReference<CurrencyRatesResponse>() {
			});
			if (response.getStatusCode().is2xxSuccessful()) {
				return response.getBody();
			}
		} catch (Exception e) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,e.getMessage()));
		}
		return null;
		

		
	}

}
