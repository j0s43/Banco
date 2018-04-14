package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Cliente;

public class ClienteDao {
	
	//Atributo
	private Connection conexao;
	
	//metodo construtor
	public ClienteDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	//Metodo que verifica se o  cliente existe com cpf e senha
	public boolean isCliente(String cpfCliente, String senhaCliente) {
		
		//Instanciar os objetos
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean resultado = false;
		
		//Verificar se o cliente existe no BD
		try {
			//prepara o sql
			ps = conexao.prepareStatement("SELECT idcliente FROM cliente WHERE cpfcliente = ? AND senhacliente = ?");
			//Setar os parametros do sql
			ps.setString(1, cpfCliente);
			ps.setString(2, senhaCliente);
			
			//executar o SQL
			rs = ps.executeQuery();
			
			//verificar se o rs retornou resultado
			resultado = rs.first();
			
			rs.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	//metodo que retorna 1 cliente
	public Cliente getCliente(String cpfCliente, String senhaCliente) {
		
		//Instanciar os objetos
			PreparedStatement ps = null;
			ResultSet rs = null;
			Cliente resultado = null;
				
			//Verificar se o cliente existe no BD
			try {
				//prepara o sql
				ps = conexao.prepareStatement("SELECT idcliente, cpfcliente, nomecliente, senhacliente FROM cliente WHERE cpfcliente = ? AND senhacliente = ?");
				//Setar os parametros do sql
				ps.setString(1, cpfCliente);
				ps.setString(2, senhaCliente);
					
				//executar o SQL
				rs = ps.executeQuery();
					
				//verificar se o rs retornou resultado
				rs.first();
				
				resultado = new Cliente(rs.getInt("idCliente"), rs.getString("cpfCliente"),
										rs.getString("nomeCliente"), rs.getString("senhaCliente"));
					
				rs.close();
				ps.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return resultado;
		
	}
	
	
	
	
	
	

}
