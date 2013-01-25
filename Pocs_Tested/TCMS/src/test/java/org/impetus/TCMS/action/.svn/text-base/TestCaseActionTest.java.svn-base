package org.impetus.TCMS.action;

import org.impetus.TCMS.base.PropertyAsserter;
import org.impetus.TCMS.base.TCMSBaseTest;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;

public class TestCaseActionTest extends TCMSBaseTest {
	
	private ActionProxy proxy;	

	public void testActionConfig() throws Exception {
		AssertActionMapping("/action", "getTestCaseList");	
	}

	public void testgetTestCaseList() throws Exception {
		proxy = getActionProxy("/action/getTestCaseList");
		assertNotNull(proxy);		
		request.setParameter("testsuiteId","1");		
		TestCaseAction action = (TestCaseAction) proxy.getAction();				
		assertNotNull("Action not found",action);
		String result = proxy.execute();
		assertTrue("Expected Result not found","list".equals(result));				
	}

	public void testgetTestCaseHistory() throws Exception {
		proxy = getActionProxy("/action/getTestCaseHistory");		
		assertNotNull(proxy);		
		TestCaseAction action = (TestCaseAction) proxy.getAction();
		action.setTcIds("1");
		assertNotNull("Action not found",action);
		String result = proxy.execute();
		assertSuccess(result);				
	}
	
	public void testgettestcaseExceptioncase() throws Exception {
		proxy = getActionProxy("/action/getTestCaseList");
		assertNotNull(proxy);		
		request.setParameter("testsuiteId","null");	
		TestCaseAction action = (TestCaseAction) proxy.getAction();				
		assertNotNull("Action not found",action);
		String result = proxy.execute();
		assertInput(result);			
	}
	
	public void testExceptiongetTestCaseHistory_1() throws Exception {
		proxy = getActionProxy("/action/getTestCaseHistory");
		assertNotNull(proxy);		
		TestCaseAction action = (TestCaseAction) proxy.getAction();
		action.setTcIds(null);
		assertNotNull("Action not found",action);
		String result = proxy.execute();
		assertInput(result);				
	}
	
	public void testExceptiongetTestCaseHistory_2() throws Exception {
		proxy = getActionProxy("/action/getTestCaseHistory");
		assertNotNull(proxy);		
		TestCaseAction action = (TestCaseAction) proxy.getAction();
		action.setTcIds("test");
		assertNotNull("Action not found",action);
		String result = proxy.execute();
		assertInput(result);				
	}
	
	@Test
    public void testProperties() {
        PropertyAsserter.assertBasicGetterSetterBehavior(new TestCaseAction(),"clientId","tcaseList","productId","tcaseExecData","currpage","totalpage","totalrec","parameters","tcIds","testSuiteId");
    }
}
