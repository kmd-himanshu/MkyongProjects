<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<html>
<head>
 <sj:head jqueryui="true" jquerytheme="redmond" />
<title>
	<s:text name="app.homepage.title"/>
</title>

<script type="text/javascript" src="/TCMS/struts/i18n/grid.locale-en.js"></script>
<script type="text/javascript" src="/TCMS/struts/js/plugins/jquery.jqGrid.js"></script>
<script type="text/javascript" src="/TCMS/struts/js/plugins/jquery.searchFilter.js"></script>
<script type="text/javascript" src="/TCMS/struts/js/plugins/grid.filter.js"></script>
<script type="text/javascript" src="/TCMS/struts/js/plugins/grid.formedit.js"></script>
<script type="text/javascript" src="/TCMS/struts/js/plugins/grid.setcolumns.js"></script>
<script type="text/javascript" src="/TCMS/struts/js/plugins/grid.addons.js"></script>

<script type="text/javascript" src="/TCMS/struts/js/struts2/jquery.grid.struts2-3.2.0.js"></script>
<script type="text/javascript" src="/TCMS/struts/js/struts2/jquery.grid.struts2-3.2.0.min.js"></script>

<link href="/TCMS/struts/themes/ui.jqgrid.css" rel="stylesheet" type="text/css" />
<link href="/TCMS/struts/themes/ui.multiselect.css" rel="stylesheet" type="text/css" />

<script src="<s:url value="/js/frame_js.js"/>" type="text/javascript"></script>
<script >
	$(document).ready(function(){
	$("#testform").hide();

	//Show Grid 

	var prdId=$("input[id=productId]").val();
	var tsuitId=$("input[id=testSuiteId]").val();
	
	if(prdId!=null && prdId!=''){
		getTestSuites(prdId);
	}
	
	if( tsuitId!=null && tsuitId!=''){
		handleJsonResult(tsuitId)
	}

	});
</script>
</head>

<body>
<div id="main-container" class="outerDiv">

	<div class="headerDiv">
		<s:if test="productList.size()!= 0">
		<%@ include file="header.jsp"%>
		</s:if>
	</div>

	<div id="sub-container" class="bodyDiv">		
				<div id="menulist" class="nestedDivTL">        					

					<table>
					<s:iterator value="productList">								
					<tr>
					<td>	
					<h3 id="heading<s:property value='productid'/>" />
						 <sj:a id="testsuite_%{name}"
									href="#" 									
									onclick="getTestSuites('%{productid}')">
								 <s:property value="name"/>
						</sj:a>
					</h3>
					<td>
					</tr>
					 </s:iterator>									
					</table>
				</div>	
				
				<div id="submenu" class="nestedDivBL">
					  <table id="testSuiteData"></table>
				</div>
				
				<div class="nestedDivTR" id="contentData">
						<table id="list"></table>
						<div id="pager"></div>
					
						<div id="testform">			

							<s:form id="myform" action="getTestCaseHistory" onsubmit="return testsubmit();">
											
							<s:hidden id="tcIds" name="tcIds" value="%{tcIds}"/>
							<s:hidden id="productId" name="productId" value="%{productId}"/>
							<s:hidden id="testSuiteId" name="testSuiteId" value="%{testSuiteId}"/>
							<s:hidden id="clientId" name="clientId" value="%{clientId}"/>
							<s:submit value="Execution History"/>						
							
							</s:form>					

						</div>

				</div>

	</div>
</div>

</body>

</html>
				

	</div>
</div>
</body>
</html>



