package com.mkyong.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

public class SimpleJdbcTemplateApp 
{
    public static void main( String[] args )
    {
    	//if you have time, 
    	//it's better to create an unit test rather than testing like this :)
    	
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
    	
    	CustomerDAO customerSimpleDAO = (CustomerDAO) context.getBean("customerSimpleDAO");
        Customer customer1 = new Customer(1, "mkyong1",21);
        Customer customer3 = new Customer(2, "mkyong2",22);
        Customer customer2 = new Customer(3, "mkyong3",23);
 
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
 
        customerSimpleDAO.insertBatch(customers);

        String sql = "UPDATE CUSTOMER SET NAME ='BATCHUPDATE'";
        customerSimpleDAO.insertBatchSQL(sql);
        
        System.out.println("Batch Insert Done!");
    	
        Customer customerA = customerSimpleDAO.findByCustomerId(1);
        System.out.println("Customer A : " + customerA);
        
        Customer customerB = customerSimpleDAO.findByCustomerId2(1);
        System.out.println("Customer B : " + customerB);
        
        List<Customer> customerAs = customerSimpleDAO.findAll();
        for(Customer cust: customerAs){
        	 System.out.println("Customer As : " + customerAs);
        }
       
        List<Customer> customerBs = customerSimpleDAO.findAll2();
        for(Customer cust: customerBs){
        	 System.out.println("Customer Bs : " + customerBs);
        }
        
        String customerName = customerSimpleDAO.findCustomerNameById(1);
        System.out.println("Customer Name : " + customerName);
        
        int total = customerSimpleDAO.findTotalCustomer();
        System.out.println("Total : " + total);
        
        
        Customer customer4 = new Customer(4, "mkyong4",24);
        Customer customer5 = new Customer(5, "mkyong5",25);
        Customer customer6 = new Customer(6, "mkyong6",26);
 
        List<Customer>customers2 = new ArrayList<Customer>();
        customers2.add(customer4);
        customers2.add(customer5);
        customers2.add(customer6);
        
        customerSimpleDAO.insertBatchNamedParameter2(customers2);
        
        //delete all records
        customerSimpleDAO.insertBatchSQL("DELETE FROM CUSTOMER");
        System.out.println("Records Deleted!");
    }
}
