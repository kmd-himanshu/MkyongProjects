/**
 * 
 */
package org.impetus.TCMS.action;

import java.util.List;
import java.util.Map;

import org.impetus.TCMS.base.PropertyAsserter;
import org.impetus.TCMS.base.TCMSBaseTest;
import org.impetus.TCMS.vo.TestSuiteVO;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;

/**
 * @author kratika.gupta
 *
 */
public class TestSuiteActionTest extends TCMSBaseTest {
			
			private ActionProxy proxy;	

			public void testActionConfig() throws Exception {
				AssertActionMapping("/action", "getTestSuiteList");	
			}

			public void testgetTestSuiteList() throws Exception {
				proxy = getActionProxy("/action/getTestSuiteList");
				assertNotNull(proxy);
				Integer prdId=1;
				request.getSession().setAttribute("clientId",1);
				request.setParameter("productId",prdId.toString());
				TestSuiteAction action = (TestSuiteAction) proxy.getAction();				
				assertNotNull("Action not found",action);
				String result = proxy.execute();
				assertTrue("Expected result not found", "list".equals(result));				
			}

			public void testExceptioncase() throws Exception {
				proxy = getActionProxy("/action/getTestSuiteList");
				assertNotNull(proxy);
				Integer prdId=1;
				request.getSession().setAttribute("clientId","1");
				request.setParameter("productId",prdId.toString());
				TestSuiteAction action = (TestSuiteAction) proxy.getAction();				
				assertNotNull("Action not found",action);
				String result = proxy.execute();	
				assertInput(result);			
			}
									
			@Test
		    public void testProperties() {
		        PropertyAsserter.assertBasicGetterSetterBehavior(new TestSuiteAction(),"testSuiteList","productId","parameters");
		    }

}
