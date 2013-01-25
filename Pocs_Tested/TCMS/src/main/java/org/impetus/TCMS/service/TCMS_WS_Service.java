/**
 * This class define soap based web service.
 * Methods
 * 1. getTestcaseHistory
 * 2. ExecuteTestCase
 */
package org.impetus.TCMS.service;

import java.util.List;

import javax.jws.WebService;

import org.impetus.TCMS.vo.TestCaseVO;

/**
 * @author kratika.gupta
 * 
 */

@WebService
public interface TCMS_WS_Service {

	public List<TestCaseVO> getTestCaseHistory(List<Integer> tCaseIds) throws Exception;
	
	public String executeTestCase(Integer tcaseId,String result,Integer userId) throws Exception;
}
