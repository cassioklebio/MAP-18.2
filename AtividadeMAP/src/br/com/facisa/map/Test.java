package br.com.facisa.map;

public class Test {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("cassio", "sebatião Araujo");
        Agente agente = new Agente(1, pessoa);
        
        System.out.println(agente);
        
			
        
        Tripulacao tripulacao = new Tripulacao(2,pessoa);
        System.out.println(tripulacao);
		
        
        Passageiro passageiro = new Passageiro(3, pessoa);
        
        System.out.println(passageiro);
        
        
        
        
        

	}

}
