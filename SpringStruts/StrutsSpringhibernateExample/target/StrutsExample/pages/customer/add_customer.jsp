<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
 
<html>
<head>
</head>
<body>
<h1>Struts + Spring + Hibernate example</h1>

<h2>Add Customer</h2>
<div style="color:red">
	<html:errors/>
</div>

<html:form action="/AddCustomer.do">

<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="customer.label.name" /> : 
	</div> 
 
	<html:text property="name" size="40" maxlength="20"/>
</div>

<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="customer.label.address" /> : 
	</div> 
 
	<html:textarea property="address" cols="50" rows="10"/>
</div>
 
<div style="padding:16px">
	<div style="float:left;padding-right:8px;">
		<html:submit>
             <bean:message key="customer.label.button.submit" />
        </html:submit>
	</div>
	<html:reset>
          <bean:message key="customer.label.button.reset" />
     </html:reset>
</div>
 
</html:form>
 
</body>
</html>