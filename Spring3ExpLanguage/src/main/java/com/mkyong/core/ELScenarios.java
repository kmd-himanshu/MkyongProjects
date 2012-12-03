package com.mkyong.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("elTest")
public class ELScenarios {

	@Value("#{T(java.lang.Math).PI}")
	private double multiplier;
	
	@Value("#{T(java.lang.Math).random()}")
	private double randomNo;
	
	@Value("abc@xyz.com")
	private String email;
	
	@Value("#{elTest.email matches'[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com'}")
	private boolean validEmail;
	
	@Autowired(required=false)
	//removing Autowired from here will result in Runtime failure
	private String optionalString;
	

	public double getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}

	public double getRandomNo() {
		return randomNo;
	}

	public void setRandomNo(double randomNo) {
		this.randomNo = randomNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isValidEmail() {
		return validEmail;
	}

	public void setValidEmail(boolean validEmail) {
		this.validEmail = validEmail;
	}
}