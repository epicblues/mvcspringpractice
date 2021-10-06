<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Success!</title>
</head>
<body>
	
	<video src="<c:url value="/uploadmovie/${fileUrl}" />" width="640" height="400" autoplay autofocus controls>
	
	</video>
</body>
</html>