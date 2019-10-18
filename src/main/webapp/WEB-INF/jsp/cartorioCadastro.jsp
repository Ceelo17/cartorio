<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>spring boot form submit example</title>
</head>
<body>
	<h2>Cadastro de Cartórios</h2>
	<div>
		<form method="post" action="cartorio/cadastrar">
			Nome: <input type="text" name="nome" /> <input type="submit"
				value="Submit">
		</form>
	</div>

	<h3>Lista de Cartórios</h3>
	<div>
		<table>
			<tr>
				<th>Id</th>
				<th>Nome</th>
			</tr>
			<!-- loop over and print our customers -->
			<c:forEach var="cartorio" items="${cartorios}">
				<tr>
					<td><c:out value="${cartorio.id}"></c:out></td>
					<td><c:out value="${cartorio.nome}"></c:out></td>

					<td><a href="/cartorio/atualizarForm/${cartorio.id}">
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