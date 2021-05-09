<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="/projectWeb/addEstado">
	
		<form:form path"idEstado"/>
		
		Nome: <form:input path="nome"/><br>
		Sigla: <form:input path="sigla"/><br>
		CogigoIBGE: <form:input path="cidigoIBGE"/><br>
		
		<input type="submit"/>
		
	</form:form>
</body>
</html>