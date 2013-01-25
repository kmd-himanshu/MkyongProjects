/**
 * 
 */
package org.impetus.TCMS.bo.impl;

import java.util.List;

import org.impetus.TCMS.bo.ProductBo;
import org.impetus.TCMS.dao.ProductDAO;
import org.impetus.TCMS.vo.ProductVO;

/**
 * @author kratika.gupta
 *
 */
public class ProductBoImpl implements ProductBo {
	
	ProductDAO productDAO;
	
	/**
	 * @param productDAO the productDAO to set
	 */
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.bo.ProductBo#getProductList(java.lang.String)
	 */
	@Override
	public List<ProductVO> getProductList(Integer clientId) throws Exception{
		
		return productDAO.getProductList(clientId);
	}
	

}
