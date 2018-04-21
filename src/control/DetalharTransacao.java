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
		
		// Obter uma conexao com o BD
		Connection conexao = Conexao.getConexao();

		// instanciar objeto ClienteDAO
		TransacaoDao cd = new TransacaoDao(conexao);

		ArrayList<Transacao> transacaos = cd.getTransacaos(idconta);

		request.setAttribute("paga", transacaos);

		RequestDispatcher rd = request.getRequestDispatcher("transacao.jsp");
		rd.forward(request, response);
	}

}
