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

<table>
  <% for(int i = 0; i <contas.size(); i++){%>

	 <tr><a href="detalharTransacao?idconta=<%=contas.get(i).getIdConta()%>&numeroconta=<%= contas.get(i).getNumeroConta() %>&agenciaconta=<%= contas.get(i).getAgenciaConta() %>&tipoconta=<%= contas.get(i).getTipoConta() %>&idcliente=<%= contas.get(i).getIdCliente() %>&nomecliente=<%= c1.getNomeCliente() %>&cpfcliente=<%= c1.getCpfCliente() %>"><%= contas.get(i).getNumeroConta() %></a></tr><br/>
	  
 <% } 
 
  
 
 %>

</table>

</body>
</html>