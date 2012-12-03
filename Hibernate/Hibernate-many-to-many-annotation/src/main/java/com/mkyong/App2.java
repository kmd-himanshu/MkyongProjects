package com.mkyong;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import com.mkyong.stock.Category;
import com.mkyong.stock.Stock;
import com.mkyong.util.HibernateUtil;

public class App2 {
	public static void main(String[] args) {
		System.out.println("Hibernate many to many (Annotation)");
		

		/*Stock stock = new Stock();
		stock.setStockCode("706654");
		stock.setStockName("PADIddscxcwsNI");
		stock.setStockId(new Integer(1));

		Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
		Category category2 = new Category("INVESTMENT", "INVESTMENT COMPANY");

		Set<Category> categories = new HashSet<Category>();
		categories.add(category1);
		categories.add(category2);

		stock.setCategories(categories);
		//session.saveOrUpdate(stock);
		*/
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Stock stock2 = (Stock)session.get(Stock.class, new Integer(1)); 
		session.getTransaction().commit();
		session.close();
		
		stock2.setStockCode("333");
		/*
		Session session2 = HibernateUtil.getSessionFactory().openSession();
		session2.beginTransaction();
		Stock stock3 = (Stock)session2.get(Stock.class, new Integer(1));
		session2.saveOrUpdate(stock2); // Non -unique object exception
		session2.getTransaction().commit();
		session2.close();*/
		
		Session session2 = HibernateUtil.getSessionFactory().openSession();
		session2.beginTransaction();
		Stock stock3 = (Stock)session2.get(Stock.class, new Integer(1));
		session2.merge(stock2); 
		session2.getTransaction().commit();
		session2.close();
		
		System.out.println("Done");
	}
}
