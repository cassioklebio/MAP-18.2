package br.com.facisa.map;

public class Tripulacao {
	
	private Pessoa pessoa;
	private int idTripulacao;
	
	public Tripulacao( int idTripulacao, Pessoa pessoa) {
		this.idTripulacao = idTripulacao;
		this.pessoa = pessoa;
	}
	
	public void setNome(String nome) {
		pessoa.setNome(nome);
	}
	
	public String  getNome() {
		return this.pessoa.getNome();
	}
	
	public void setEndereco(String endereco) {
		pessoa.setEndereco(endereco);
	}
	
	public String getEndereco() {
		return this.pessoa.getEndereco();
	}
		
	public int getIdTripulacao() {
		return idTripulacao;
	}
	public void setIdTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
	}
	
	public String toString() {
		return this.idTripulacao+" "+this.getNome()+" "+ this.getEndereco();
	}
	
	
	
	
	


	
	
}
