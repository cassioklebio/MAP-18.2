package br.com.facisa.map;

public class Agente {
	
	private int idAgente;
	private Pessoa pessoa;
	private String nome;
	private String endereco;
	
	
	
	public int getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
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