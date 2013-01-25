/*
 * $Id: LoginTest.java 739661 2009-02-01 00:06:00Z davenewton $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.impetus.TCMS.action;

import org.impetus.TCMS.base.PropertyAsserter;
import org.impetus.TCMS.base.TCMSBaseTest;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;

public class UserActionTest extends TCMSBaseTest {
	
	private ActionProxy proxy;	

	public void testLoginConfig() throws Exception {
		AssertActionMapping("/action", "Login");	
	}

	public void testLogin() throws Exception {
		proxy = getActionProxy("/action/Login");
		assertNotNull(proxy);
		UserAction loginAction = (UserAction) proxy.getAction();
		loginAction.setUsername("testusr1");
		loginAction.setPassword("1234");
		assertNotNull("Action not found",loginAction);
		String result = proxy.execute();
		assertSuccess(result);

	}

	public void testLoginSubmitInput() throws Exception {
		proxy = getActionProxy("/action/Login");
		assertNotNull(proxy);		
		UserAction loginAction =  (UserAction) proxy.getAction();
		assertNotNull("Action not found",loginAction);	
		loginAction.setUsername(null);
		loginAction.setPassword(null);
		String result = proxy.execute();
		assertInput(result);		
	}

	public void testLoginExceptionCase() throws Exception {
		proxy = getActionProxy("/action/Login");
		assertNotNull(proxy);
		UserAction loginAction = (UserAction) proxy.getAction();				
		assertNotNull("Action not found",loginAction);
		loginAction.setUserBo(null);
		loginAction.setUsername("test-usr");
		loginAction.setPassword("1234");
		String result = proxy.execute();
		assertInput(result);

	}

	@Test
    public void testProperties() {
        PropertyAsserter.assertBasicGetterSetterBehavior(new UserAction(),"username","password");
    }
	
}
