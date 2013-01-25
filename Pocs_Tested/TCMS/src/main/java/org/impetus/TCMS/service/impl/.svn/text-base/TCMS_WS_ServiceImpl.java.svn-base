/**
 * 
 */
package org.impetus.TCMS.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.impetus.TCMS.bo.TestCaseBo;
import org.impetus.TCMS.bo.UserBo;
import org.impetus.TCMS.model.Producttestcases;
import org.impetus.TCMS.model.Testcasehistory;
import org.impetus.TCMS.model.Userdetails;
import org.impetus.TCMS.service.TCMS_WS_Service;
import org.impetus.TCMS.vo.TestCaseVO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kratika.gupta
 *
 */


@WebService(endpointInterface = "org.impetus.TCMS.service.TCMS_WS_Service",serviceName="getTestHistory")

public class TCMS_WS_ServiceImpl implements TCMS_WS_Service {
		
	final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	TestCaseBo testCaseBo;
	
	@Autowired
	UserBo userBo;
	
	
	/**
	 * @return the testCaseBo
	 */
	public TestCaseBo getTestCaseBo() {
		return testCaseBo;
	}

	/**
	 * @param testCaseBo the testCaseBo to set
	 */
	public void setTestCaseBo(TestCaseBo testCaseBo) {
		this.testCaseBo = testCaseBo;
	}

	/**
	 * @return the userBo
	 */
	public UserBo getUserBo() {
		return userBo;
	}

	/**
	 * @param userBo the userBo to set
	 */
	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}


	
	public List<TestCaseVO> getTestCaseHistory(List<Integer> tCaseIds) throws Exception {
		//	
		logger.info("Webservice Call:getTestCaseHistory");
		logger.info("Webservice Call Params : "+tCaseIds);
		return testCaseBo.getTestCasesHistory(tCaseIds);
	}
	
	public String executeTestCase(Integer tcaseId,String result,Integer userId) throws Exception{
		logger.info("Webservice Call:executeTestCase");
		logger.info("Webservice Call Params : "+tcaseId+" : "+result+" : "+userId);
		Testcasehistory tchistory = new Testcasehistory();
		String exResult ="Error has been occoured.";
		java.util.Date execDate= new java.util.Date();
		tchistory.setExecDate(execDate);
		Producttestcases producttestcases = testCaseBo.getTestcasefromId(tcaseId);
		tchistory.setProducttestcases(producttestcases);
		Userdetails userdetails = userBo.getUserfromId(userId);
		tchistory.setUserdetails(userdetails);
		tchistory.setResult(result);
		String exId=testCaseBo.executeTestCase(tchistory);
		if(exId!=null)
			exResult="Execution data updated";
		return exResult;
	}

}
