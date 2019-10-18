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
				<tr>
					<td><c:out value="${cartorio.nome}"></c:out></td>
					<td><a href="/cartorio/${cartorio.id}/atualizarForm">
							<button type="submit" class="btn btn-primary">Edit User</button>
					</a></td>
					<td><a href="/cartorio/${cartorio.id}/deletar">
							<button type="submit" class="btn btn-primary">Delete
								User</button>
					</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>