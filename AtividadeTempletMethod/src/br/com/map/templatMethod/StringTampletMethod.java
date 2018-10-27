package br.com.map.templatMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class StringTampletMethod {
	
	private String nome;
	
	protected abstract String mudaString(String nome);
	
	
    public String StringTemplate(String nome) {
    	return mudaString(nome);
    	
    		
    }


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String mudaString() {
		// TODO Auto-generated method stub
		return null;
	}
}
