<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>
.error {
	color: #ff0000;
}
.errorblock{
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding:8px;
	margin:16px;
}
</style>
</head>

<body>
<h2>Spring's form checkbox example</h2>

<form:form method="POST" commandName="customerForm">
<form:errors path="*" cssClass="errorblock" element="div"/>
<table>


<tr>
<td>Subscribe to newsletter? : </td>
<td><form:checkbox path="receiveNewsletter" /></td>
<td><form:errors path="receiveNewsletter" cssClass="error" /></td>
</tr>
<tr>
<td>Favourite Languages : </td>
<td>
	<form:checkbox path="favLanguages" value="Java"/>Java 
	<form:checkbox path="favLanguages" value="C++"/>C++ 
	<form:checkbox path="favLanguages" value=".Net"/>.Net
</td>
<td><form:errors path="favLanguages" cssClass="error" /></td>
</tr>

<tr>
<td>Favourite Web Frameworks : </td>
<td>
	<form:checkboxes items="${webFrameworkList}" path="favFramework" /> 
</td>
<td><form:errors path="favFramework" cssClass="error" /></td>
</tr>

<tr>
<td colspan="3"><input type="submit" /></td>
</tr>
</table>
</form:form>

</body>
</html>