package com.mkyong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//before a method is invoke
public class HijackBeforeMethod implements MethodBeforeAdvice
{
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("HijackBeforeMethod : Before method hijacked!");
	}
	
}
