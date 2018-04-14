package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	// metodo para retornar uma conexao ao BD
	public static Connection getConexao() {
		
		//criando o objeto de conexao
		Connection conexao = null;
		
		//Conectar no banco de dados
		try {
			//referenciar o driver JDBC
			Class.forName("com.mysql.jdbc.Driver");
					
			//Criar string de conexao
			String url ="jdbc:mysql://localhost/cliente";
			String username = "root";
			String password = "root";
					
			//Realizar conexao xom o BD
			conexao = DriverManager.getConnection(url, username ,password);
				
		} catch (ClassNotFoundException | SQLException e) {
			//Mostra o erro
			e.printStackTrace();
		}
	
	return conexao;
	}
}