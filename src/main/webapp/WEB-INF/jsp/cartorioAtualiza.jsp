<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Editar Cart�rio</title>
</head>
<body>
	<h2>Editar Cart�rio</h2>
	<form action="/cartorio/atualizar/${cartorio.id}" method="post">

		Nome : <input type="text" name="nome" value="${cartorio.nome}" /> <input
			type="submit" value="Submit">
	</form>
</body>
</html>