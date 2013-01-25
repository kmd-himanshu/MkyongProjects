/**
 * 
 */
package org.impetus.TCMS.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ParameterAware;
import org.impetus.TCMS.bo.TestCaseBo;
import org.impetus.TCMS.common.logging.ExceptionHandler;
import org.impetus.TCMS.model.Producttestcases;
import org.impetus.TCMS.vo.TestCaseVO;

/**
 * @author kratika.gupta
 * 
 */
public class TestCaseAction extends TCMSBaseAction implements ParameterAware {

	TestCaseBo testCaseBo;
	private List<Producttestcases> tcaseList;
	private List<TestCaseVO> tcaseExecData;
	private int currpage;
	private int totalpage;
	private int totalrec;
	private Map parameters;
	private String tcIds;
	private String clientId;
	private String productId;
	private String testSuiteId;	
	
	
	/**
	 * @return the tcIds
	 */
	public String getTcIds() {
		return tcIds;
	}

	/**
	 * @param tcIds the tcIds to set
	 */
	public void setTcIds(String tcIds) {
		this.tcIds = tcIds;
	}

	/**
	 * @return the parameters
	 */
	public Map getParameters() {
		return parameters;
	}

	/**
	 * @param parameters
	 *            the parameters to set
	 */
	public void setParameters(Map parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return the currpage
	 */
	public int getCurrpage() {
		return currpage;
	}

	/**
	 * @param currpage
	 *            the currpage to set
	 */
	public void setCurrpage(int currpage) {
		this.currpage = currpage;
	}

	/**
	 * @return the totalpage
	 */
	public int getTotalpage() {
		return totalpage;
	}

	/**
	 * @param totalpage
	 *            the totalpage to set
	 */
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	/**
	 * @return the totalrec
	 */
	public int getTotalrec() {
		return totalrec;
	}

	/**
	 * @param totalrec
	 *            the totalrec to set
	 */
	public void setTotalrec(int totalrec) {
		this.totalrec = totalrec;
	}

	/**
	 * @param testCaseBo
	 *            the testCaseBo to set
	 */
	public void setTestCaseBo(TestCaseBo testCaseBo) {
		this.testCaseBo = testCaseBo;
	}

	public String getJSON() {
		this.currpage = 1;
		this.totalpage = 2;
		this.totalrec = 12;
		return getTestCasesList();
	}

	/**
	 * @return the tcaseList
	 */
	public List<Producttestcases> getTcaseList() {
		return tcaseList;
	}

	/**
	 * @param tcaseList
	 *            the tcaseList to set
	 */
	public void setTcaseList(List<Producttestcases> tcaseList) {
		this.tcaseList = tcaseList;
	}

	
	/**
	 * @return the tcaseExecData
	 */
	public List<TestCaseVO> getTcaseExecData() {
		return tcaseExecData;
	}

	/**
	 * @param tcaseExecData the tcaseExecData to set
	 */
	public void setTcaseExecData(List<TestCaseVO> tcaseExecData) {
		this.tcaseExecData = tcaseExecData;
	}

	
	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the testSuiteId
	 */
	public String getTestSuiteId() {
		return testSuiteId;
	}

	/**
	 * @param testSuiteId the testSuiteId to set
	 */
	public void setTestSuiteId(String testSuiteId) {
		this.testSuiteId = testSuiteId;
	}

	/**
	 * 
	 * @return
	 */
	public String getTestCasesList() {
		try {
			HttpServletRequest req = ServletActionContext.getRequest();
					
			String tsuId = getParameterValue("testsuiteId");
			int tsId;
			if(tsuId==null)
				tsId = Integer.parseInt(req.getParameter("testsuiteId"));
			else
				tsId = Integer.parseInt(tsuId); 
			
			System.out.println("test case Action ts id : " + tsId);
			this.tcaseList = testCaseBo.getTestCases(tsId);
			return "list";
		} catch (Exception ex) {
			String errMsg = ExceptionHandler.handleException(ex);
			addActionError(errMsg);
			ExceptionHandler.handleException(ex);
			return INPUT;
		}

	}
	
	public String getTestCaseHistory() {
		try {
			tcIds = getTcIds();
			System.out.println("test case Action ts id222 : " + tcIds);
			if(tcIds!=null){
				List<String> tcaseIds = new ArrayList<String>();
				String idArr[]= tcIds.split(",");
				tcaseIds = Arrays.asList(idArr);
				List<Integer> tcaseIdlist = new ArrayList<Integer>();
				if(tcaseIds.size()>0)
				{
					for(String id:tcaseIds){
						tcaseIdlist.add(Integer.parseInt(id));
					}
				}
				this.tcaseExecData = testCaseBo.getTestCasesHistory(tcaseIdlist);
				return SUCCESS;
			}
			return INPUT;			
		} catch (Exception ex) {
			String errMsg = ExceptionHandler.handleException(ex);
			addActionError(errMsg);
			ExceptionHandler.handleException(ex);
			return INPUT;
		}

	}

	public String getParameterValue(String param) {
		Object varr = getParameters().get(param);
		if (varr == null)
			return null;
		return ((String[]) varr)[0];
	}

}
