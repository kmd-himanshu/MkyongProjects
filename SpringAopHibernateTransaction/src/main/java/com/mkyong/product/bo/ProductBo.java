package com.mkyong.product.bo;

import com.mkyong.product.model.Product;

public interface ProductBo {
	
	void save(Product product, int qoh);
	
}
