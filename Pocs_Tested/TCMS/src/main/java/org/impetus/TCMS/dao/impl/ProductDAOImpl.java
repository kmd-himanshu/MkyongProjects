/**
 * 
 */
package org.impetus.TCMS.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.impetus.TCMS.common.db.GenericDAOImpl;
import org.impetus.TCMS.dao.ProductDAO;
import org.impetus.TCMS.vo.ProductVO;

/**
 * @author kratika.gupta
 *
 */
public class ProductDAOImpl extends GenericDAOImpl implements ProductDAO {

	public List<ProductVO> getProductList(Integer clientId) throws Exception{	
		try{
		Session session = getSession();	
		String hqlQuery ="select new org.impetus.TCMS.vo.ProductVO(prd.prdId, prd.name)" + 
				" from Productdetails as prd " +
						" join prd.clientdetails as client" +					
						" where client.clientId =:clientId";
				
		List<ProductVO> productList= (List<ProductVO>)session.createQuery(hqlQuery).setParameter("clientId",clientId.shortValue()).list();
			return productList;
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
}
