/**
 * 
 */
package org.impetus.TCMS.bo.impl;

import java.util.List;

import org.impetus.TCMS.bo.TestSuiteBo;
import org.impetus.TCMS.dao.TestSuiteDAO;
import org.impetus.TCMS.model.Producttestsuite;
import org.impetus.TCMS.vo.TestSuiteVO;

/**
 * @author kratika.gupta
 * 
 */
public class TestSuiteBoImpl implements TestSuiteBo {

	TestSuiteDAO testSuiteDAO;

	public void setTestSuiteDAO(TestSuiteDAO testSuiteDAO) {
		this.testSuiteDAO = testSuiteDAO;
	}

/*	@Override
	public String addNew(Producttestsuite prodtestsuite) throws Exception

	{

		return testSuiteDAO.addNew(prodtestsuite);
	}*/

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.impetus.TCMS.bo.TestSuiteBo#getProductList(java.lang.Integer,
	 * java.lang.Integer)
	 */
	@Override
	public List<TestSuiteVO> gettSuiteList(Integer clientId, Integer productId)
			throws Exception

	{
		return testSuiteDAO.gettSuiteList(clientId, productId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.impetus.TCMS.bo.TestSuiteBo#getTestSuiteFromId(java.lang.Integer)
	 */
	@Override
	public Producttestsuite getTestSuiteFromId(Integer Id) throws Exception{

		return testSuiteDAO.getTestSuiteFromId(Id);
	}

}
