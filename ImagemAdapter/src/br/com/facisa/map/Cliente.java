package br.com.facisa.map;

public class Cliente {

	public static void main(String[] args) {
		
	      ImagemTarget imagem = new ImagemAdapter();
	      imagem.carregaImagem("teste.png");
	      imagem.desenharImagem(0, 0, 10, 10);

	}

}
