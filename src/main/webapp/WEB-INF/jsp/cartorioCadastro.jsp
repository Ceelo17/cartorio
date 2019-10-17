<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
    <title>spring boot form submit example</title>
</head>
<body>
<h2>Employee Details</h2>
<form method="post" action="cadastrarCartorio"> 
    Enter Employee Name : <input type="text" name="nome"/>
    <input type="submit" value="Submit">
</form>
</body>
</html>