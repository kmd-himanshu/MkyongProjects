package com.mkyong.product.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.product.dao.ProductDao;
import com.mkyong.product.model.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao{
	
	public void save(Product product){
		getHibernateTemplate().save(product);
	}
	
}