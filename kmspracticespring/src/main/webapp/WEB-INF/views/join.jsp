<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Form</title>
</head>
<body>
	<c:if test="${not empty sessionScope.authUser }">
		<h1> ${authUser}님 안녕하세요</h1>
	</c:if>
	<c:if test="${empty sessionScope.authUser }">

		<h1> 회원 가입하러 오셨습니까?</h1>
		<form action="<c:url value="/join"/>" method="POST">
		<input type="text" name="name" placeholder="name"/>
		<input type="text" name="email" placeholder="email"/>
		<input type="password" name="password" placeholder="password"/>
		<button>Submit!</button>
	</form>
	</c:if>
	
	
	
	
	<c:if test="${empty sessionScope.authUser }">
	<h1>아니면 로그인 ? login please!</h1>
	<form action="<c:url value="/login"/>" method="POST">
		<input type="text" name="email" placeholder="email"/>
		<input type="password" name="password" placeholder="password"/>
		<button>Submit!</button>
	</form>
	</c:if>
	
	
	<script>
		document.querySelectorAll("input").forEach(input => {
			input.style.display="block";
		})
		
	</script>
	
	
</body>
</html>