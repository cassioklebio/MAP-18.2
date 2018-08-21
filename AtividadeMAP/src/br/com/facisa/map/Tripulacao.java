package br.com.facisa.map;

public class Tripulacao {
	
	private int idTripulacao;
	private String nome;
	private String endereco;
	private Pessoa pessoa;
	
	
	public Tripulacao(int idTripulacao, String nome, String endereco) {
		super();
		this.idTripulacao = idTripulacao;
		this.nome = nome;
		this.endereco = endereco;
	}


	public int getIdTripulacao() {
		return idTripulacao;
	}


	public void setIdTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
	}


	public String getNome() {
		return this.pessoa.getNome();
	}


	public void setNome(String nome) {
		pessoa.setNome(nome);
	}


	public String getEndereco() {
		return this.pessoa.getEndereco();
	}


	public void setEndereco(String endereco) {
		pessoa.setEndereco(endereco);
	}
	
	
	
}
