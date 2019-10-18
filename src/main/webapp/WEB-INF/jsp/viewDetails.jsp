<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<div>
		<table>
			<tr>
				<th>Id</th>
				<th>Nome</th>
			</tr>
			<!-- loop over and print our customers -->
			<c:forEach var="cartorio" items="${cartorios}">
				<!-- construct an "update" link with customer id -->
				<c:url var="atualizaLink" value="/cartorio/atualizarForm">
					<c:param name="customerId" value="${cartorio.id}" />
				</c:url>
				<!-- construct an "delete" link with customer id -->
				<c:url var="deletaLink" value="/cartorio/deletar">
					<c:param name="customerId" value="${cartorio.id}" />
				</c:url>
				<tr>
					<td>${cartorio.id}</td>
					<td>${cartorio.nome}</td>
					<td>
						<!-- display the update link --> <a href="${atualizaLink}">Atualizar</a>
						| <a href="${deletaLink}">Deletar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Reading List</title>
</head>
<body>
	<h2>Lista de Cartorios</h2>
	<table>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Edit</th>
		</tr>
		<c:forEach items="${cartorios}" var="cartorio">
			<tr>
				<td>${cartorio.id}</td>
				<td>${cartorio.nome}</td>
				<td><a th:href="@{/edit/{id}(id=${cartorio.id})}">Editar</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>