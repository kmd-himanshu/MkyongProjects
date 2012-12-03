package com.mkyong.product.bo.impl;

import com.mkyong.product.bo.ProductBo;
import com.mkyong.product.bo.ProductQohBo;
import com.mkyong.product.dao.ProductDao;
import com.mkyong.product.model.Product;
import com.mkyong.product.model.ProductQoh;

public class ProductBoImpl implements ProductBo{
	
	ProductDao productDao;
	ProductQohBo productQohBo;
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void setProductQohBo(ProductQohBo productQohBo) {
		this.productQohBo = productQohBo;
	}

	public void save(Product product, int qoh){
		
		productDao.save(product);
		System.out.println("Product Inserted");
		
		ProductQoh productQoh = new ProductQoh();
		productQoh.setProductId(product.getProductId());
		productQoh.setQty(qoh);
		
		//productQoh.setProductId(123);
		
		productQohBo.save(productQoh);
		System.out.println("ProductQoh Inserted");
		
	}

}
