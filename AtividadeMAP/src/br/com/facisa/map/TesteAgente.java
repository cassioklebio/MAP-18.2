package br.com.facisa.map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteAgente {

	@Test
	void test() {
		Pessoa pessoa1 = new Pessoa("cassio", "sabastião");
		Agente agente = new Agente(1,pessoa1);
		
	}

}
