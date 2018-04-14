package control;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import dao.Conexao;
import model.Cliente;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recupera os parametros
		String cpfCliente = request.getParameter("cpfcliente");
		String senhaCliente = request.getParameter("senhacliente");
		
		//Obter uma conexao com o BD
		Connection conexao = Conexao.getConexao();
		
		//instanciar objeto ClienteDAO
		ClienteDao cd = new ClienteDao(conexao);
		
		//Verificar se o usuario e valido
		if (cd.isCliente(cpfCliente, senhaCliente)) {
			//obter cliente
			Cliente c = cd.getCliente(cpfCliente, senhaCliente);
			
			//criar um atributo novo
			request.setAttribute("cliente", c);
			
			//repasar o request/response 
			RequestDispatcher rd = request.getRequestDispatcher("servletConta");
			
			rd.forward(request, response);
			
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("loginErro.jsp");
			
			rd.forward(request, response);
		}
	}

}
