<%@page import="model.Conta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="model.Cliente"%>
    <%@ page import="model.Conta" %>
    <%@ page import="java.util.ArrayList" %>

<% ArrayList<Conta> contas = (ArrayList<Conta>)request.getAttribute("detalhes"); %>

<% Cliente c1 = (Cliente)request.getAttribute("cliente"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detalhar Conta Cliente</title>
</head>
<body>
<h1>Bem-vindo  <%= c1.getNomeCliente() %>!</h1>


  <% for(int i = 0; i < contas.size(); i++){%>
	  
	  <%= contas.get(i).getNumeroConta() + " " + contas.get(i).getAgenciaConta() + " " + contas.get(i).getTipoConta()  %><br/>
	  
 <% } %>


</body>
</html>