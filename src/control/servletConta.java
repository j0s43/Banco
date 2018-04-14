package control;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import dao.Conexao;

/**
 * Servlet implementation class servletConta
 */
@WebServlet("/servletConta")
public class servletConta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletConta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recupera os parametros
		
		

		//Obter uma conexao com o BD
		Connection conexao = Conexao.getConexao();
		
		//instanciar objeto ClienteDAO
		ClienteDao cd = new ClienteDao(conexao);
	}

}
