package org.impetus.TCMS.dao;

import java.util.List;

import org.impetus.TCMS.model.Producttestcases;
import org.impetus.TCMS.model.Testcasehistory;
import org.impetus.TCMS.vo.TestCaseVO;

public interface TestCaseDAO {
	
	 /* 
	 * 
	 */
	public List<Producttestcases> getTestCases(Integer tSuiteId) throws Exception;
		
	public String addNew(Producttestcases prodtestcase) throws Exception;
	
	public List<TestCaseVO> getTestCasesHistory(List<Integer> tCaseIds) throws Exception;
	
	public String executeTestCase(Testcasehistory tchistory) throws Exception;
	
	public Producttestcases getTestcasefromId(Integer testcaseId) throws Exception;

}
