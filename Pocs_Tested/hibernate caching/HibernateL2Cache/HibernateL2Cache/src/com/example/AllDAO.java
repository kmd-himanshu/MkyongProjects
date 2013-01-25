package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AllDAO {
	
	public static void readAll(SessionFactory factory){

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		for(int i=0; i<20; i++){
			Employee e = new Employee();
			e.setName("Test"+i);
			e.setSalary(10000+i);
			session.save(e);
		}
			
		transaction.commit();
		session.close();
		
		//opening another session
		session = factory.openSession();
		//query will be fired on database as it is the first time 
		//we are fetching the data of id=19
		Employee e = (Employee) session.get(Employee.class, 19);
		System.out.println(e.getName());
		session.close();
		
		//opening another session
		session = factory.openSession();
		//transaction = session.beginTransaction();
		//query is NOT fired on database
		//because of 2nd Level Cache in place
		Employee e1 = (Employee) session.get(Employee.class, 19);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		//update the salary
		e1.setSalary(5000);
		session.saveOrUpdate(e1);
		session.flush();
		//transaction.commit();
		session.close();
		
		//opening another session
		session = factory.openSession();
		//query is again fired on database because of the
		//update done in previous session
		Employee e2 = (Employee) session.get(Employee.class, 19);
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		session.close();
	}
}
