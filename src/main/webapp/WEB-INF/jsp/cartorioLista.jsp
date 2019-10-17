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
		</tr>
		<c:forEach items="${cartorios}" var="cartorio">
			<tr>
				<td>${cartorio.id}</td>
				<td>${cartorio.nome}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>