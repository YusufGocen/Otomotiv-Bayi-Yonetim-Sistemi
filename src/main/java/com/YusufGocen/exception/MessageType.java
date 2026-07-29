package com.YusufGocen.exception;

import lombok.Getter;

@Getter
public enum MessageType {
	
	NO_RECORD_EXIST("1004","Kayıt bulunamadı"),
	GENERAL_EXCEPTION("9999","Genel Hata Oluştu"),
	TOKEN_IS_EXCEPTİON("1005","tokenın Süresi Bitmiştir"),
	USERNAME_OR_PASSWORD_INVALID("1007","Kullanıcı adı veya Şifre hatalı"),
	CAR_STATUS_ALREADY_SALED("1008","Araba Satılmış."),
	CUSTOMER_AMOUNTH_IS_NOT_ENOUGH("1009","Müşterinin Parası Yeterli Değildir."),
	USERNAME_NOT_FOUND("1006","Username bulunamadı");
	
	

	
	private String code;
	
	private String message;
	
	  MessageType(String code, String message) {
		this.code=code;
		this.message=message;
	}
	
}
