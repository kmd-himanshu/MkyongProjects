package com.mkyong.product.bo.impl;

import com.mkyong.product.bo.ProductQohBo;
import com.mkyong.product.dao.ProductQohDao;
import com.mkyong.product.model.ProductQoh;

public class ProductQohBoImpl implements ProductQohBo{
	
	ProductQohDao productQohDao;
	
	public void setProductQohDao(ProductQohDao productQohDao) {
		this.productQohDao = productQohDao;
	}

	public void save(ProductQoh productQoh){
		productQohDao.save(productQoh);
	}

}
