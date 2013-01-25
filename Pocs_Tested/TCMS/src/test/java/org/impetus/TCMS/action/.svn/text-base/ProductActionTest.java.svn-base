package org.impetus.TCMS.action;

import org.impetus.TCMS.base.PropertyAsserter;
import org.impetus.TCMS.base.TCMSBaseTest;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;

public class ProductActionTest extends TCMSBaseTest {
	
	private ActionProxy proxy;	

	public void testActionConfig() throws Exception {
		AssertActionMapping("/action", "getProducts");	
	}

	public void testgetProducts() throws Exception {
		proxy = getActionProxy("/action/getProducts");
		assertNotNull(proxy);		
		request.getSession().setAttribute("clientId",1);		
		ProductAction action = (ProductAction) proxy.getAction();
		action.setProductId("1");
		action.setTestSuiteId("1");
		action.setProductList(null);
		assertNotNull("Action not found",action);
		String result = proxy.execute();
		assertSuccess(result);				
	}
				
	public void testExceptioncase() throws Exception {
		proxy = getActionProxy("/action/getProducts");
		assertNotNull(proxy);		
		//request.getSession().setAttribute("clientId","1");		
		request.getSession().setAttribute("clientId",1.1);
		ProductAction action = (ProductAction) proxy.getAction();
		action.setProductId("1");		
		String result = proxy.execute();
		assertInput(result);			
	}
	
	@Test
    public void testProperties() {
        PropertyAsserter.assertBasicGetterSetterBehavior(new ProductAction(),"clientId","productList","productId","testSuiteId");
    }
}



