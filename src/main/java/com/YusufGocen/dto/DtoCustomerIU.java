package com.YusufGocen.dto;

import java.sql.Date;

import com.YusufGocen.model.Account;
import com.YusufGocen.model.Address;

import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoCustomerIU {

	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;

	@NotNull
	private String tckn;

	@NotNull
	private Date birthOfDate;
	
	@NotNull
	private Long addressId;

	@NotNull
	private Long accountId;
}
