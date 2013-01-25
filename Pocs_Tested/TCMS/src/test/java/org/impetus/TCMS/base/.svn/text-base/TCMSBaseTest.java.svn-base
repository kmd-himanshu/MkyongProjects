package org.impetus.TCMS.base;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.StrutsSpringTestCase;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class TCMSBaseTest extends StrutsSpringTestCase{
		
		private final Logger log = Logger.getLogger(this.getClass());
		
		@Override
	    public String getContextLocations() {
	    		
	      return "/application-context-test.xml";

	    }
		
	    protected void assertSuccess(String result) throws Exception {
	        assertTrue("Expected a success result!",
	                ActionSupport.SUCCESS.equals(result));     
	    }

	    protected void assertInput(String result) throws Exception {
	        assertTrue("Expected an input result!",
	                ActionSupport.INPUT.equals(result));
	    }

	    protected Map assertFieldErrors(ActionSupport action) throws Exception {
	        assertTrue(action.hasFieldErrors());
	        return action.getFieldErrors();
	    }

	    protected void assertFieldError(Map field_errors, String field_name, String error_message) {

	        List errors = (List) field_errors.get(field_name);
	        assertNotNull("Expected errors for " + field_name, errors);
	        assertTrue("Expected errors for " + field_name, errors.size()>0);
	        // TODO: Should be a loop
	        assertEquals(error_message,errors.get(0));

	    }

		
	    public void AssertActionMapping(String namespace,String actionName) {
	        ActionMapping mapping = getActionMapping(namespace+"/"+actionName+".action");  
	      
	        assertNotNull("Action Mapping not found",mapping);
	        assertTrue("Wrong Name Space "+mapping.getNamespace(),"/action".equals(mapping.getNamespace()));
	        assertTrue("Wrong Action Name "+mapping.getName(),actionName.equals(mapping.getName()));
	    }


}
