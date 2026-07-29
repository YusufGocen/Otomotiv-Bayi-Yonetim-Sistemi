package com.YusufGocen.model;

import java.math.BigDecimal;

import com.YusufGocen.enums.CarStatusType;
import com.YusufGocen.enums.CurrencyType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car extends BaseEntity{

	private String Plaka;
	
	private String brand;

	private String model;

	private Integer productionYear;

	private BigDecimal price;
	
	@Enumerated(EnumType.STRING)
	private CurrencyType currencyType;

	private BigDecimal damagePrice;

	@Enumerated(EnumType.STRING)
	private CarStatusType carStatusType;


}
