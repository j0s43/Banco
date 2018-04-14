package model;

public class Cliente {
	//Atributos 
	private int idCliente;
	private String cpfCliente;
	private String nomeCliente;
	private String senhaCliente;
	
	//Metodo construtor
	public Cliente(int idCliente, String cpfCliente, String nomeCliente, String senhaCliente) {
		super();
		this.idCliente = idCliente;
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.senhaCliente = senhaCliente;
	}
	
	//Get e Set
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	
	

}
