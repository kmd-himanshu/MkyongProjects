package org.impetus.TCMS.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ParameterAware;
import org.impetus.TCMS.bo.ProductBo;
import org.impetus.TCMS.common.logging.ExceptionHandler;
import org.impetus.TCMS.vo.ProductVO;

public class ProductAction extends TCMSBaseAction{

	private Integer clientId;
	private ProductBo productBo;
	private List<ProductVO> productList;	
	private String productId;
	private String testSuiteId;
	//private Map parameters;
	
	/**
	 * @return the parameters
	 *//*
	public Map getParameters() {
		return parameters;
	}

	*//**
	 * @param parameters
	 *            the parameters to set
	 *//*
	public void setParameters(Map parameters) {
		this.parameters = parameters;
	}
*/
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
	 * @return the productLists
	 */
	public List<ProductVO> getProductList() {
		return productList;
	}

	/**
	 * @param productLists
	 *            the productLists to set
	 */
	public void setProductList(List<ProductVO> productList) {
		this.productList = productList;
	}

	/**
	 * @return the clientId
	 */
	public Integer getClientId() {
		return clientId;
	}
	
	/**
	 * @param clientId
	 *            the clientId to set
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	/**
	 * @param productBo
	 *            the productBo to set
	 */
	public void setProductBo(ProductBo productBo) {
		this.productBo = productBo;
	}

	public String getProducts() {
		try {
			HttpSession session = ServletActionContext.getRequest()
					.getSession();
			setClientId((Integer) session.getAttribute("clientId"));
			//System.out.println("useraction data "	+ (Integer) session.getAttribute("clientId"));
			
			this.productList = productBo.getProductList(clientId);
			return SUCCESS;
		} catch (Exception e) {
			String errMsg = ExceptionHandler.handleException(e);
			addActionError(errMsg);
			ExceptionHandler.handleException(e);
			return INPUT;
		}
	}

}
