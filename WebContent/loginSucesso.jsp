<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Cliente"%>

<% Cliente c = (Cliente)request.getAttribute("cliente"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Banco - login sucesso</title>
</head>
<body>
<h1>Dethale de conta de <%= c.getNomeCliente() %>!</h1>

</body>
</html>