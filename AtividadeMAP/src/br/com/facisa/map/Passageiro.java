package br.com.facisa.map;

public class Passageiro {
	
	private int numero;
	private Pessoa pessoa;
	
	
	public Passageiro(int numero, Pessoa pessoa) {
		this.numero = numero;
		this.pessoa = pessoa;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	
	public String toString() {
		return this.numero+" "+this.getNome()+" "+this.getEndereco();
	}
	
	
}