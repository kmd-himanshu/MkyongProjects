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
		
		/*Main main = new Main();
		while(true){
			main.imp();
			Thread.currentThread().sleep(1000);		
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
			phoneNumbers.add(new Phone("house","22222"));
			phoneNumbers.add(new Phone("mobile","888888"));
			
			Student student = new Student("ram" ,new java.util.Date() , phoneNumbers);
			session.save(student);
			transaction.commit();
             session.close();
			 session =sessionFactory.openSession();
			 Transaction tx = session.beginTransaction();
			 Query query = session.createQuery("from Student p where p.id=1");
			 query.setCacheable(true);
			 Iterator it = query.list().iterator();
			 while (it.hasNext ()){
				 Student p = (Student) it.next();
			    System.out.println(p.getStudentName());
			 }
			 query = session.createQuery("from Student p where p.id=1");
			 query.setCacheable(true);
			 it = query.list().iterator();
			 while (it.hasNext ()){
				 Student p = (Student) it.next();
			    System.out.println(p.getStudentName());
			 }
			 query = session.createQuery("from Student p where p.id=1");
			 query.setCacheable(true);
			 it = query.list().iterator();
			 while (it.hasNext ()){
				 Student p = (Student) it.next();
			    System.out.println(p.getStudentName());
			 }
			 query = session.createQuery("from Student p where p.id=1");
			 query.setCacheable(true);
			 it = query.list().iterator();
			 while (it.hasNext ()){
				 Student p = (Student) it.next();
			    System.out.println(p.getStudentName());
			 }
			 query = session.createQuery("from Student p where p.id=1");
			 query.setCacheable(true);
			 it = query.list().iterator();
			 while (it.hasNext ()){
				 Student p = (Student) it.next();
			    System.out.println(p.getStudentName());
			 }
			 tx.commit();
		
        } catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {

			 session.close();
		}

	}

}
