package org.impetus.TCMS.service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.junit.Test;
import org.springframework.web.context.ContextLoaderListener;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.sun.jersey.spi.spring.container.servlet.SpringServlet;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;
import com.sun.jersey.test.framework.spi.container.TestContainerFactory;
import com.sun.jersey.test.framework.spi.container.grizzly.web.GrizzlyWebTestContainerFactory;

public class TCMS_RS_ServiceTest extends JerseyTest {

	@Override
	protected TestContainerFactory getTestContainerFactory() {
		return new GrizzlyWebTestContainerFactory();
	}

	public TCMS_RS_ServiceTest() throws Exception {

		super(new WebAppDescriptor.Builder("org.impetus.TCMS.service")
				.contextPath("TCMS")
				.contextParam("contextConfigLocation",
						"classpath:application-context-test.xml")
				.servletClass(SpringServlet.class)
				.contextListenerClass(ContextLoaderListener.class).build());

	}

	@Test
	public void testgetTestCases() throws Exception {

		WebResource webResource = resource();
		String tCases = webResource.path("TCMS/getTestCaseHistory")
				.queryParam("id", "1").accept(MediaType.APPLICATION_XML)
				.get(String.class);
		// System.out.println("got test cases"+tCases );
	}

	@Test
	public void testaddTestcase() throws Exception {
		WebResource webResource = resource();
		MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
		formData.add("name", "tcase10");
		formData.add("description", "tcase10");
		formData.add("type", "negative");
		formData.add("execType", "automated");

		ClientResponse response = webResource.path("TCMS/addTestCase")
				.queryParam("testsuiteId", "1")
				.type("application/x-www-form-urlencoded")
				.post(ClientResponse.class, formData);

	}
}
