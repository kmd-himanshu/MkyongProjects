package com.mkyong.customer.bo;

public interface CustomerBo {

	void addCustomer();
	
	void addCustomerReturnValue();
	
	void addCustomerThrowException() throws Exception;
	
	void addCustomerAround(String name);
}