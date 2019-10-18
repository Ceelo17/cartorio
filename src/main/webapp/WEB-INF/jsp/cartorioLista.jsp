<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Lista de Cartórios</title>
</head>
<body>
	<h2>Lista de Cartórios</h2>

	<h3>
		<a href="/cartorio">Cadastrar Cartório</a>
	</h3>
	<div>
		<div>
			<table border="1">
				<c:forEach var="cartorio" items="${cartorios}">
					<tr>
						<th>Id:</th>
						<td><c:out value="${cartorio.id}"></c:out></td>


						<th>Nome:</th>
						<td><c:out value="${cartorio.nome}"></c:out></td>

						<td><a href="/cartorio/atualizarForm/${cartorio.id}">
								<button type="submit" class="btn btn-primary">Editar</button>
						</a></td>
						<td><a href="/cartorio/${cartorio.id}/deletar">
								<button type="submit">Deletar</button>
						</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>