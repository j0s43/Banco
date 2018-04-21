package model;

import java.sql.Date;

public class Transacao {
	//Atributos
	private int idTransacao;
	private int idConta;
	private Date dataTransacao;
	private String tipoTransacao;
	private String valorTransa�ao;
	
	//Metodo Construtor
	public Transacao(int idTransacao, int idConta, Date dataTransacao, String tipoTransacao,
			String valorTransa�ao) {
		super();
		this.idTransacao = idTransacao;
		this.idConta = idConta;
		this.dataTransacao = dataTransacao;
		this.tipoTransacao = tipoTransacao;
		this.valorTransa�ao = valorTransa�ao;
		
		//Get e set
		}
		public int getIdTransacao() {
			return idTransacao;
		}
		public void setIdTransacao(int idTransacao) {
			this.idTransacao = idTransacao;
		}
		public int getIdConta() {
			return idConta;
		}
		public void setIdConta(int idConta) {
			this.idConta = idConta;
		}
		public Date getDataTransacao() {
			return dataTransacao;
		}
		public void setDataTransacao(Date dataTransacao) {
			this.dataTransacao = dataTransacao;
		}
		public String getTipoTransacao() {
			return tipoTransacao;
		}
		public void setTipoTransacao(String tipoTransacao) {
			this.tipoTransacao = tipoTransacao;
		}
		public String getValorTransa�ao() {
			return valorTransa�ao;
		}
		public void setValorTransa�ao(String valorTransa�ao) {
			this.valorTransa�ao = valorTransa�ao;
		}
	
	
	


}
