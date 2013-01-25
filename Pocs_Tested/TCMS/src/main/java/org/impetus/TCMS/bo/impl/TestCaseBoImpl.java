/**
 * 
 */
package org.impetus.TCMS.bo.impl;

import java.util.List;

import org.impetus.TCMS.bo.TestCaseBo;
import org.impetus.TCMS.dao.TestCaseDAO;
import org.impetus.TCMS.model.Producttestcases;
import org.impetus.TCMS.model.Producttestsuite;
import org.impetus.TCMS.model.Testcasehistory;
import org.impetus.TCMS.vo.TestCaseVO;

/**
 * @author kratika.gupta
 *
 */
public class TestCaseBoImpl implements TestCaseBo {

	TestCaseDAO testcaseDAO;
	
	/**
	 * @param testcaseDAO the testcaseDAO to set
	 */
	public void setTestcaseDAO(TestCaseDAO testcaseDAO) {
		this.testcaseDAO = testcaseDAO;
	}

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.bo.TestCaseBo#getTestCases(java.lang.Integer)
	 */
	@Override
	public List<Producttestcases> getTestCases(Integer tSuiteId) throws Exception {
		// 
		return testcaseDAO.getTestCases(tSuiteId) ;
	}

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.bo.TestCaseBo#addNew(org.impetus.TCMS.model.Producttestsuite)
	 */
	@Override
	public String addNew(Producttestcases producttestcases) throws Exception{
		// 
		return testcaseDAO.addNew(producttestcases);
	}

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.bo.TestCaseBo#getTestCasesHistory(java.lang.Integer)
	 */
	@Override
	public List<TestCaseVO> getTestCasesHistory(List<Integer> tCaseIds) throws Exception{
		
		return testcaseDAO.getTestCasesHistory(tCaseIds);
	}

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.bo.TestCaseBo#executeTestCase(org.impetus.TCMS.model.Testcasehistory)
	 */
	@Override
	public String executeTestCase(Testcasehistory tchistory) throws Exception {
		// 
		return testcaseDAO.executeTestCase(tchistory);
	}

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.bo.TestCaseBo#getTestcasefromId(java.lang.Integer)
	 */
	@Override
	public Producttestcases getTestcasefromId(Integer testcaseId)
			throws Exception {
		// 
		return testcaseDAO.getTestcasefromId(testcaseId);
	}
	
	
	
	

}
