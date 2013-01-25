/**
 * TCMS_Service class is restful web service implementation.
 * API:
 * 1. Add Testcase
 * 
 */
package org.impetus.TCMS.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

import org.impetus.TCMS.vo.TestCaseVO;

/**
 * @author kratika.gupta
 * 
 */
public interface TCMS_Service {

	public Response addTestcase(String name, String desc, String type,
			String execType, HttpServletResponse servletResponse)
			throws Exception;

	public List<TestCaseVO> getTestcaseHistory(List<Integer> testcaseId,
			HttpServletResponse servletResponse) throws Exception;
}
