package org.impetus.TCMS.service.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.impetus.TCMS.service.TCMS_WS_Service;

public class WSCLient {	
		 
		public static void main(String[] args) throws Exception {
			
		    URL url = new URL("http://localhost:8080/TCMS/services/ws/getTestCaseHistory?wsdl");
	        QName qname = new QName("http://impl.service.TCMS.impetus.org/", "getTestHistory");
	 
	        Service service = Service.create(url, qname);
	 
	        TCMS_WS_Service tCService = service.getPort(TCMS_WS_Service.class);	        
	      
	      /*  ((BindingProvider)tCService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,
	        "testusr1");
	        ((BindingProvider)tCService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,
	        "1234");*/
	        List<Integer> tcaseIds = new ArrayList<Integer>();
			tcaseIds.add(1);
	        System.out.println(tCService.getTestCaseHistory(tcaseIds));
	    }
	 
	
}
