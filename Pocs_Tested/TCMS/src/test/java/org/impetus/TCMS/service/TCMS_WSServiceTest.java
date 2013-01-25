package org.impetus.TCMS.service;

import org.impetus.TCMS.base.TCMSBaseTest;
import org.impetus.TCMS.bo.TestCaseBo;
import org.impetus.TCMS.bo.UserBo;
import org.impetus.TCMS.service.impl.TCMS_ServiceImpl;
import org.impetus.TCMS.service.impl.TCMS_WS_ServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.opensymphony.xwork2.interceptor.annotations.Before;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/application-context-test.xml"})
public class TCMS_WSServiceTest extends TCMSBaseTest {
		
	@Autowired	
	TCMS_WS_ServiceImpl TCMSWSServiceImpl;	
	
	@Autowired
	TestCaseBo testCaseBo;
	
	@Autowired
	UserBo userBo;
	
		
	@Before	
	public void setUp(){
		TCMSWSServiceImpl = new TCMS_WS_ServiceImpl();				
		testCaseBo = Mockito.mock(TestCaseBo.class);
		userBo = Mockito.mock(UserBo.class);
		TCMSWSServiceImpl.setTestCaseBo(testCaseBo);
		TCMSWSServiceImpl.setUserBo(userBo);		
	}

	@Test
	public void test_WSService_op1() throws Exception{
		String result = TCMSWSServiceImpl.executeTestCase(1,"pass", 1);
		assertTrue("Expected Result not found","Execution data updated".equals(result));				

		
	}
	

}
