<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head> 
<title>
	<s:text name="app.homepage.title"/>
</title>
</head>
<body>

<div id="main-container" class="outerDiv">

	<div class="headerDiv">		
		<%@ include file="header.jsp"%>		
	</div>

	<div id="sub-container" class="bodyDiv">
		<p class="title">Test Cases Execution History</p>
                <div style="left: 20px; overflow: auto;">
                <table cellspacing="0" cellpadding="0" border="0" class="tbl-grid-5 gridlines">
			<thead>
				<tr>
					<td><b>Name</b></td>
					<td><b>User</b></td>
					<td><b>Date</b></td>
					<td><b>Result</b></td>
				</tr>
			</thead>
			<tbody>
				 <s:if test="%{tcaseExecData!=null && tcaseExecData.size()>0 }">
				<s:iterator value="tcaseExecData">
				<tr>
					<td><nobr><s:property value="testcasename" /></td></nobr></td>
					<td><s:property value="username" /></td>
					<td><s:property value="execdate" /></td>
					<td><s:property value="result" /></td>
				</tr>
				</s:iterator>
				</s:if>
				<s:else>
						<tr><td colspan="4" align="center">No Record Found</td></tr>
				</s:else>
			</tbody>			
		</table>
    </div>
	<div>
	<div id="prevform" class="nestedDivBR">			

							<s:form id="backform" action="getProducts">											
							<s:hidden id="productId" name="productId" value="%{productId}"/>
							<s:hidden id="testSuiteId" name="testSuiteId" value="%{testSuiteId}"/>
							<s:hidden id="clientId" name="clientId" value="%{clientId}"/>										
							<s:submit value="Back"/>						
							
							</s:form>					

	</div>

	</div>
</div>	
</div>
</body>
</html>