<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<form action="<c:url value="/upload" />" method="post" enctype="multipart/form-data">
		<input type="file" name="file" />
		<button>Upload</button>
	</form>
</body>
</html>