/**
 * 
 */
package org.impetus.TCMS.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.impetus.TCMS.common.db.GenericDAOImpl;
import org.impetus.TCMS.dao.TestCaseDAO;
import org.impetus.TCMS.model.Producttestcases;
import org.impetus.TCMS.model.Producttestsuite;
import org.impetus.TCMS.model.Testcasehistory;
import org.impetus.TCMS.vo.TestCaseVO;
import org.springframework.dao.DataAccessException;

/**
 * @author kratika.gupta
 *
 */
public class TestCaseDAOImpl extends GenericDAOImpl implements TestCaseDAO{

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.dao.TestCaseDAO#getTestCases(java.lang.Integer)
	 */
	@Override
	public List<Producttestcases> getTestCases(Integer tSuiteId) throws DataAccessException {
		List<Producttestcases> tCaseList=null;
		try{
		Session session = getSession();
		String hqlQuery = "select new org.impetus.TCMS.model.Producttestcases(tcs.testcaseid,tcs.producttestsuite,tcs.name,tcs.description,tcs.type,tcs.execType,tcs.createdOn)"
				+ " from Producttestcases as tcs"				
				+ " join tcs.producttestsuite as tsu"
				+ " where tsu.testSuiteId =:tsId";

		tCaseList = (List<Producttestcases>) session
				.createQuery(hqlQuery)				
				.setParameter("tsId", tSuiteId).list();
				
		}
		catch(DataAccessException ex){
			throw ex;
		}
		return tCaseList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.impetus.TCMS.dao.TestSuiteDAO#addNew()
	 */
	@Override
	public String addNew(Producttestcases prodtestcase) throws Exception{
		return save(prodtestcase).toString();
	}

	public List<TestCaseVO> getTestCasesHistory(List<Integer> tCaseIds)throws DataAccessException{
		List<TestCaseVO> tCaseData=null;
		try{
			Session session = getSession();
			String hqlQuery = "select new org.impetus.TCMS.vo.TestCaseVO(tc.name,tch.userdetails.name,tch.execDate,tch.result)"
					+ " from Testcasehistory as tch"				
					+ " join tch.producttestcases tc"									
					+ " where tc.testcaseid in (:tcIdList)";
			
			tCaseData = (List<TestCaseVO>) session
					.createQuery(hqlQuery)				
					.setParameterList("tcIdList", tCaseIds).list();
					
			}
			catch(DataAccessException ex){
				throw ex;
			}
		return tCaseData;
	}

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.dao.TestSuiteDAO#getTestSuiteFromId(java.lang.Integer)
	 */
	@Override
	public Producttestcases getTestcasefromId(Integer testcaseId) throws Exception{

		return (Producttestcases)get(Producttestcases.class, testcaseId);
	}
	
	@Override
	public String executeTestCase(Testcasehistory tchistory) throws Exception{
		return save(tchistory).toString();
	}
}
