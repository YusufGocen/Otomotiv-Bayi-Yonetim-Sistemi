package com.YusufGocen.controller.İmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.YusufGocen.controller.IRestCurrencyRatesController;
import com.YusufGocen.controller.RestBaseController;
import com.YusufGocen.controller.RootEntity;
import com.YusufGocen.dto.CurrencyRatesResponse;
import com.YusufGocen.service.ICurrencyRatesService;

@RestController
@RequestMapping("/rest/api/")
public class RestCurrencyRatesControllerİmpl extends RestBaseController implements IRestCurrencyRatesController{

	@Autowired
	private ICurrencyRatesService currencyRatesService;
	
	@GetMapping("/currency-rates")
	@Override
	public RootEntity<CurrencyRatesResponse> getCurrencyRates(@RequestParam String startDate, @RequestParam String endDate) {
		return ok(currencyRatesService.getCurrencyRates(startDate, endDate));
	}

}
