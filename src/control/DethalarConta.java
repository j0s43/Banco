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
import dao.ContaDao;
import model.Cliente;
import model.Conta;

/**
 * Servlet implementation class DethalarConta
 */
@WebServlet("/dethalarConta")
public class DethalarConta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DethalarConta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cliente c = (Cliente)request.getAttribute("cliente");
		
		//Obter uma conexao com o BD
		Connection conexao = Conexao.getConexao();
				
		//instanciar objeto ClienteDAO
		ContaDao cd = new ContaDao(conexao);
		
		ArrayList<Conta> contas = cd.getContas(c.getIdCliente());
		
		request.setAttribute("detalhes", contas);
		
		RequestDispatcher rd = request.getRequestDispatcher("detalharaContaC.jsp");
		rd.forward(request, response);
		
		
		
		
		
		
	}

}
