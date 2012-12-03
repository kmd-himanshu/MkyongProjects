package com.mkyong.product.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.product.dao.ProductDao;
import com.mkyong.product.dao.ProductQohDao;
import com.mkyong.product.model.Product;
import com.mkyong.product.model.ProductQoh;

public class ProductQohDaoImpl extends HibernateDaoSupport implements ProductQohDao{
	
	public void save(ProductQoh productQoh){
		getHibernateTemplate().save(productQoh);
	}
	
}