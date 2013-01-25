package com.cache.ehcache;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		/*Main main = new Main();
		while(true){
			main.imp();
			Thread.currentThread().sleep(5000);		
		}
		
	}
	public void imp(){*/
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			 session =sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			Set<Phone> phoneNumbers = new HashSet<Phone>();
			phoneNumbers.add(new Phone("house","222222"));
			phoneNumbers.add(new Phone("mobile","6666666"));
			
			Student student = new Student("ram",new java.util.Date(),phoneNumbers );
		    session.save(student);
		    transaction.commit();
		   
		    Transaction tx = session.beginTransaction();
		    
		    // this block is used when we want to show
            //   the  first level caching
		    // using get / load method
		    
		  
		    Student student1 = ( Student) session.get( Student.class, 1L);
		    System.out.println(student1.getStudentName());
		    System.out.println(student1.getStudentId());
		    Student student2 = ( Student) session.get( Student.class, 1L);   
		    System.out.println(student2 .getStudentName());       
		    System.out.println(student2 .getStudentId());       
		    tx.commit();
		    session.close();
		    
		    
		    // normal setting without any caching type 
			
			/*String SQL_QUERY ="from Student student";
			  Query query = session.createQuery(SQL_QUERY);    
			  query.setCacheable(true);
			  for(Iterator it=query.iterate();it.hasNext();){
			Student student1=(Student)it.next();
			 System.out.println("ID: " + student1.getStudentId());
			 System.out.println("Name: " + student1.getStudentName());
			 }
			   SQL_QUERY ="from Student student";
			   query = session.createQuery(SQL_QUERY);
			  query.setCacheable(true);
			  for(Iterator it=query.iterate();it.hasNext();){
			 Student student1=(Student)it.next();
			 System.out.println("ID: " + student1.getStudentId());
			 System.out.println("Name: " + student1.getStudentName());
			 }*/

		//	session.delete(student);
			  
			  
			  
			  
			  
			
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
		
		}

	}

}
