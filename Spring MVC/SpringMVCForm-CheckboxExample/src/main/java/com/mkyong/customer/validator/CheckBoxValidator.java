package com.mkyong.customer.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mkyong.customer.model.Customer;

public class CheckBoxValidator implements Validator{

	@Override
	public boolean supports(Class clazz) {
		//just validate the Customer instances
		return Customer.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Customer cust = (Customer)target;
		
		if(cust.getFavLanguages().length==0){
			errors.rejectValue("favLanguages", "required.favLanguages");
		}
		
	}
	
}