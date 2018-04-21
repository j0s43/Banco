<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="model.Cliente"%>
    <%@ page import="model.Conta" %>
    <%@ page import="model.Transacao" %>
    <%@ page import="java.util.ArrayList" %>
       
       <% ArrayList<Conta> contas = (ArrayList<Conta>)request.getAttribute("detalhes"); %>
       <% ArrayList<Transacao> transacaos = (ArrayList<Transacao>)request.getAttribute("paga");%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaçao da conta</title>
</head>
<body>
<h1>Transacao da conta</h1>

<table>
  <% for(int i = 0; i <contas.size(); i++){%>
  
	 <tr><%=contas.get(i).getNumeroConta() %></tr><br/>
	  
 <% } %>



  <% for(int i = 0; i <transacaos.size(); i++){%>
  
	 <tr><%=transacaos.get(i).getDataTransacao() + " " + transacaos.get(i).getTipoTransacao() + " " + transacaos.get(i).getValorTransaçao()%></tr><br />
	  
 <% } %>

</table>

</body>
</html>