/**
 * 
 */
package org.impetus.TCMS.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ParameterAware;
import org.impetus.TCMS.bo.TestSuiteBo;
import org.impetus.TCMS.common.logging.ExceptionHandler;
import org.impetus.TCMS.vo.TestSuiteVO;

/**
 * @author kratika.gupta
 * 
 */
public class TestSuiteAction extends TCMSBaseAction implements ParameterAware {

	private TestSuiteBo testSuiteBo;
	private List<TestSuiteVO> testSuiteList;
	private Integer productId;
	private Map parameters;

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
	 * @param testSuiteBo
	 *            the testSuiteBo to set
	 */
	public void setTestSuiteBo(TestSuiteBo testSuiteBo) {
		this.testSuiteBo = testSuiteBo;
	}

	/**
	 * @return the testSuiteList
	 */
	public List<TestSuiteVO> getTestSuiteList() {
		return testSuiteList;
	}

	/**
	 * @param testSuiteList
	 *            the testSuiteList to set
	 */
	public void setTestSuiteList(List<TestSuiteVO> testSuiteList) {
		this.testSuiteList = testSuiteList;
	}

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/*
	 * 
	 */
	public String getTestSuites() {
		try {
			HttpSession session = ServletActionContext.getRequest()
					.getSession();
			Integer clientId = ((Integer) session.getAttribute("clientId"));
			System.out.println("tsdaction data "
					+ (Integer) session.getAttribute("clientId"));
			// Add check for null
			String prodId = getParameterValue("productId");
			if(prodId==null)
				this.productId = Integer.parseInt(ServletActionContext.getRequest().getParameter("productId"));
			else
				this.productId = Integer.parseInt(prodId);
			this.testSuiteList = testSuiteBo.gettSuiteList(clientId, productId);
			return "list";
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
