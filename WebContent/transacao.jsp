<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="model.Cliente"%>
    <%@ page import="model.Conta" %>
    <%@ page import="model.Transacao" %>
    <%@ page import="java.util.ArrayList" %>

       
       
       <% ArrayList<Transacao> transacaos = (ArrayList<Transacao>)request.getAttribute("paga");%>
       <%  String nome = (String)request.getAttribute("nome");%>
       <%  String cpf = (String)request.getAttribute("cpf");%>
       <%  String numero = (String)request.getAttribute("numero");%>
       <%  String agencia = (String)request.getAttribute("agencia");%>
       <%  String tipo = (String)request.getAttribute("tipo");%>
	   <% ArrayList<String> saldo = new ArrayList<String>(); %>	
       
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaçao da conta</title>
</head>
<body>
<h1>Transacao da conta</h1>

<table>

<h2>Usuario</h2>

<%= nome%><br />
<%= cpf%><br />

<h2>Dados da conta</h2>
<h4>Numro---Agencia---Tipo</h4>
<%= numero + " ___ " + agencia + " ______ " + tipo%><br />

<h2>Dados das contas</h2>
<h4>Data-----------Tipo---Valor</h4>
  <% for(int i = 0; i <transacaos.size(); i++){%>
  		 
  		 <%saldo.add(transacaos.get(i).getTipoTransacao() + transacaos.get(i).getValorTransaçao()); %>
  
	 <tr><%=transacaos.get(i).getDataTransacao() + " __ " + transacaos.get(i).getTipoTransacao() + " ___ " + transacaos.get(i).getValorTransaçao()%></tr><br />
	  
 <% }  %>


 



</table>

</body>
</html>