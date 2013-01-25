/**
 * 
 */
package org.impetus.TCMS.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.impetus.TCMS.common.db.GenericDAOImpl;
import org.impetus.TCMS.dao.TestSuiteDAO;
import org.impetus.TCMS.model.Producttestsuite;
import org.impetus.TCMS.vo.TestSuiteVO;
import org.springframework.dao.DataAccessException;

/**
 * @author kratika.gupta
 * 
 */
public class TestSuiteDAOImpl extends GenericDAOImpl implements TestSuiteDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.impetus.TCMS.dao.TestSuiteDAO#addNew()
	 */
	/*@Override
	public String addNew(Producttestsuite prodtestsuite) {
		return save(prodtestsuite).toString();
	}*/

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.impetus.TCMS.dao.TestSuiteDAO#gettSuiteList(java.lang.Integer,
	 * java.lang.Integer)
	 */
	@Override
	public List<TestSuiteVO> gettSuiteList(Integer clientId, Integer productId) throws DataAccessException{
		List<TestSuiteVO> tSuiteList=null;
		try{
		Session session = getSession();
		String hqlQuery = "select new org.impetus.TCMS.vo.TestSuiteVO(pts.testSuiteId, pts.name)"
				+ " from Producttestsuite as pts"
				+ " join pts.clientdetails as client"
				+ " join pts.productdetails as prd"
				+ " where client.clientId =:clientId and prd.prdId=:prdId";

		tSuiteList = (List<TestSuiteVO>) session
				.createQuery(hqlQuery)
				.setParameter("clientId", clientId.shortValue())
				.setParameter("prdId", productId.shortValue()).list();
				
		} catch (DataAccessException ex) {
			throw ex;
		}
		
		
return tSuiteList;
		
	}

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.dao.TestSuiteDAO#getTestSuiteFromId(java.lang.Integer)
	 */
	@Override
	public Producttestsuite getTestSuiteFromId(Integer Id) throws Exception{

		return (Producttestsuite)get(Producttestsuite.class, Id);
	}

	
	
}
