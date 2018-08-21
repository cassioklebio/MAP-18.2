package br.com.facisa.map;

public class Test {

	public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("cassio", "Sebastião");
        Agente agente = new Agente();
        agente.setIdAgente(1);
		
        
		System.out.println(agente.getIdAgente());
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		
		
		

	}

}
