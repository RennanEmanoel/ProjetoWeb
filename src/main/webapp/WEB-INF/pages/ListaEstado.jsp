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

	<table width="100%">
		<tr>
		
			<td width="33%">Nome: </td>
			<td width="33%">Sigla: </td>
			<td width="34%">C&oacute;digo IBGE: </td>
			
		</tr>
			
		<c:forEach var="meuEstado" itens="${estados}">
		
			<tr>
				<td>
					<c:url var="minhaUrl" value="/projectWeb/CadastroEstado">
						<c:param name="idEstado">${meuEstado.idEstado}</c:param>
					</c:url>
					
				<a href=${minhaUrl}>${meuEstado.nome}</a>
				</td>
				<td>${meuEstado.sigla}</td>
				<td>${meuEstado.codigoIBGE}</td>
			<tr>	
		
		</c:forEach>
		
	</table>

</body>
</html>