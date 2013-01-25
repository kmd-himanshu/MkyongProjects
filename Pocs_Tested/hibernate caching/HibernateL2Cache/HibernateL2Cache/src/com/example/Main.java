package com.example;

import java.io.IOException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		
		//Hibernate is started
		SessionFactory factory=configuration.configure().buildSessionFactory();
			
			AllDAO.readAll(factory);
		
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
		//Hibernate is shutdown
		factory.close();
	}

}
