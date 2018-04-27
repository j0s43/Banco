package control;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Conexao;
import dao.TransacaoDao;
import model.Cliente;
import model.Transacao;

/**
 * Servlet implementation class DetalharCliente
 */
@WebServlet("/detalharTransacao")
public class DetalharTransacao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DetalharTransacao() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idconta = Integer.parseInt(request.getParameter("idconta"));
		int idcliente = Integer.parseInt(request.getParameter("idcliente"));
		String numeroconta = request.getParameter("numeroconta");
		String agenciaconta= request.getParameter("agenciaconta");
		String tipoconta = request.getParameter("tipoconta"); 
		String nomecliente = request.getParameter("nomecliente");
		String cpfcliente = request.getParameter("cpfcliente");
				
		// Obter uma conexao com o BD
		Connection conexao = Conexao.getConexao();

		// instanciar objeto ClienteDAO
		TransacaoDao cd = new TransacaoDao(conexao);

		ArrayList<Transacao> transacaos = cd.getTransacaos(idconta);
		
		//criar um atributo novo
		request.setAttribute("paga", transacaos);
		request.setAttribute("nome", nomecliente);
		request.setAttribute("cpf", cpfcliente);
		request.setAttribute("numero", numeroconta);
		request.setAttribute("agencia", agenciaconta);
		request.setAttribute("tipo", tipoconta);

		RequestDispatcher rd = request.getRequestDispatcher("transacao.jsp");
		rd.forward(request, response);
	}

}
