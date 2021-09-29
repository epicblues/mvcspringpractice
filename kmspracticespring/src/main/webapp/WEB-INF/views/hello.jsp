<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Its index Page</title>
</head>
<body>
	Hello ${requestScope.name}
	
	<p>${requestScope.num1 + requestScope.num2 * 100}</p>
	${empty applicationScope.oracleDataSource }
	
	<c:forEach items="${kmsList}" var="vo" varStatus="stat">
		<ul>
			<li>${vo.no}</li>
			<li>${vo.email }</li>
			<li>${vo.name }</li>
			<li>index : ${stat.index }</li>
			<li>count : ${stat.count }</li>
		</ul>
	</c:forEach>
	<c:set var="customValue" value="customedVal" scope="page"/>
	
	<h1>customValue : ${pageScope.customValue}</h1>
	
	<a href="<c:url value="/hello.html" />">yo</a>
</body>
</html>