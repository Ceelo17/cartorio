<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Cadastro de Cartórios</title>
</head>
<body>
	<h2>Cadastro de Cartórios</h2>

	<div>
		<div>
			<form method="post" action="cartorio/cadastrar">
				Nome: <input type="text" name="nome"
					placeholder="Digite o nome do cartório" required="required" /> <input
					type="submit" value="Submit">
			</form>
		</div>

		<h3>
			<a href="/cartorio/listar">Lista de Cartórios</a>
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
	</div>
</body>
</html>