<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Spring's form checkbox example</h2>

Receive Newsletter : ${customer.receiveNewsletter} <br/>

Favourite Languages : 
<c:forEach items="${customer.favLanguages}" var="current">
   [<c:out value="${current}" />]
</c:forEach>
<br/>

Favourite Web Frameworks : 
<c:forEach items="${customer.favFramework}" var="current">
   [<c:out value="${current}" />]
</c:forEach>
<br/>

</body>
</html>