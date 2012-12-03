package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Customer obj = (Customer) context.getBean("customerBean");
		System.out.println(obj);
		
		ELScenarios obj1 = (ELScenarios) context.getBean("elTest");
		System.out.println(obj1.getMultiplier());
		System.out.println(obj1.getRandomNo());
		System.out.println(obj1.isValidEmail());
	}
}
