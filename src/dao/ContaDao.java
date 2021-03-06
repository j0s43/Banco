package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.Conta;

public class ContaDao {
	//Atributo
	private Connection conexao;
		
	//metodo construtor
	public ContaDao(Connection conexao) {
			this.conexao = conexao;
	}
	
	//Detalhar conta do cliente
	public ArrayList<Conta> getContas(int idCliente){
		
		ArrayList<Conta> resultado = new ArrayList<Conta>();
		
		
		//Instanciar os objetos
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		//Dethalar Contas do cliente
		try {
			//Prepara o sql
			ps = conexao.prepareStatement("SELECT idconta, idcliente, numeroconta, agenciaconta, tipoconta FROM conta WHERE idcliente = ?");
			//setar os parametro sql
			ps.setInt(1, idCliente);
			
			//executar o SQL
			rs = ps.executeQuery();
			while(rs.next()) {
				resultado.add(new Conta(rs.getInt("idConta"), rs.getInt("idCliente"), rs.getString("numeroConta"),  rs.getString("agenciaConta"), rs.getString("tipoConta")));	
			}
			
			rs.close();
			ps.close();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
		
		
		
		
	}
	

}
