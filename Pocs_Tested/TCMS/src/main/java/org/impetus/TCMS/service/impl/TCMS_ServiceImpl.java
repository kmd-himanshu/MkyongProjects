/**
 * 
 */
package org.impetus.TCMS.service.impl;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.impetus.TCMS.bo.TestCaseBo;
import org.impetus.TCMS.bo.TestSuiteBo;
import org.impetus.TCMS.model.Producttestcases;
import org.impetus.TCMS.model.Producttestsuite;
import org.impetus.TCMS.service.TCMS_Service;
import org.impetus.TCMS.vo.TestCaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author kratika.gupta
 * 
 */
@Component
@Path("/TCMS")
public class TCMS_ServiceImpl implements TCMS_Service {

	final Log logger = LogFactory.getLog(getClass());

	@Autowired
	TestCaseBo testCaseBo;

	@Autowired
	TestSuiteBo testSuiteBo;

	@Context
	UriInfo uriInfo;
	@Context
	HttpServletRequest request;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/addTestCase")
	public Response addTestcase(@FormParam("name") String name,
			@FormParam("description") String desc,
			@FormParam("type") String type,
			@FormParam("execType") String execType,
			@Context HttpServletResponse servletResponse) throws Exception {
		Producttestcases prdestcases = new Producttestcases();
		prdestcases.setName(name);
		prdestcases.setDescription(desc);
		prdestcases.setType(type);
		prdestcases.setExecType(execType);
		java.util.Date createdOn = new java.util.Date();
		prdestcases.setCreatedOn(createdOn);
		int testsuiteId = Integer.parseInt(request.getParameter("testsuiteId"));
		Producttestsuite producttestsuite = testSuiteBo
				.getTestSuiteFromId(testsuiteId);

		prdestcases.setProducttestsuite(producttestsuite);
		logger.info("Rest Webservice Call:getTestCaseHistory");
		logger.info("Webservice Call Params : ");
		logger.info("Form data");
		logger.info(" name: " + name);
		logger.info(" desc: " + desc);
		logger.info(" type:  " + type);
		logger.info(" execType: " + execType);

		String id = testCaseBo.addNew(prdestcases);
		logger.info("Rest Web Service: Form data saved");

		URI uri = uriInfo.getAbsolutePathBuilder().path(id).build();
		Response.created(uri).build();

		return Response.status(200).build();

		// servletResponse.sendRedirect("../pages/new_contact.html");*/
	}

	@GET
	@Path("/getTestCaseHistory")
	@Produces(MediaType.APPLICATION_XML)
	public List<TestCaseVO> getTestcaseHistory(
			@QueryParam("id") List<Integer> testcaseId,
			@Context HttpServletResponse servletResponse) throws Exception {
		return testCaseBo.getTestCasesHistory(testcaseId);

	}

}
