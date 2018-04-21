package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.Transacao;

public class TransacaoDao {
	//Atributo
	private Connection conexao;
		
	//metodo construtor
	public TransacaoDao(Connection conexao) {
			this.conexao = conexao;
	}
	
	//Detalhar conta do cliente
	public ArrayList<Transacao> getTransacaos(int idConta){
		
		ArrayList<Transacao> resultado = new ArrayList<Transacao>();
		
		
		//Instanciar os objetos
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		//Dethalar Contas do cliente
		try {
			//Prepara o sql
			ps = conexao.prepareStatement("SELECT * FROM transacao WHERE idconta = ?");
			//setar os parametro sql
			ps.setInt(1, idConta);
			
			//executar o SQL
			rs = ps.executeQuery();
			while(rs.next()) {
				resultado.add(new Transacao(rs.getInt("idtransacao"), rs.getInt("idconta"), rs.getDate("datatransacao"),  rs.getString("tipotransacoa"), rs.getString("valortransacao")));	
			}
			
			rs.close();
			ps.close();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
		
		
		
		
	}
	

}
