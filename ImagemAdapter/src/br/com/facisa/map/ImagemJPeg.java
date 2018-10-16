package br.com.facisa.map;

public class ImagemJPeg implements Imagem {

	@Override
	public void carregaImagem(String nomeImagem) {
		System.out.println("carregando.imagem: "+ nomeImagem);    
		
		
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		System.out.println("Imagem desenhada");
		
	}

	
		
		
	

}
