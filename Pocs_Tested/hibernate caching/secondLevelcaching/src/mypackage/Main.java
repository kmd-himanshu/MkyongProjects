package mypackage;

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

	
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Set<Phone> phoneNumbers = new HashSet<Phone>();
			phoneNumbers.add(new Phone("house", "22222"));
			phoneNumbers.add(new Phone("mobile", "888888"));

			Student student = new Student("ram", new java.util.Date(),
					phoneNumbers);
			session.save(student);
			
			transaction.commit();
			session.close();
			
		/*	// read only cache
			Session session1 = sessionFactory.openSession();
			Transaction tx = session1.beginTransaction();
			Student student0 = (Student) session1.get(Student.class, 1L);
			System.out.print("name" + student0.getStudentName());
			tx.commit();
			session1.close();
			
			

			Session session2 = sessionFactory.openSession();
			Transaction tx2 = session2.beginTransaction();
			Student student2 = (Student) session2.get(Student.class, 1L);
			System.out.print("name" + student2.getStudentName());
			tx2.commit();
			session2.close();
			*/
			
			


			// READ-WRITE TYPE CACHING
			// if we open both session together our code made 3 transaction
			// select from data base , update database , third again select from database
		

			Session session1 = sessionFactory.openSession();
			  
			  Transaction tx1 = session1.beginTransaction();
			  Student s1 = (Student) session1.load(Student.class, 1L);
			  System.out.println (s1.getStudentName());
			  s1.setStudentName ("" + System.currentTimeMillis());
			  tx1.commit();
			 
			// here when we open session2 after session1 is closed we reduce one select statement from  the database 
			  
			  Session session2 = sessionFactory.openSession();    

			  Transaction tx2 = session2.beginTransaction();
			  Student p2 = (Student)session2.load(Student.class, 1L);
			  System.out.println (p2.getStudentName());
			  tx2.commit();

			  session1.close();
			  session2.close();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {

		}

	}

}
