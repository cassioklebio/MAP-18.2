package br.com.facisa.map;

public class ImagemAdapter implements ImagemTarget{
	
	Imagem Advanceimage;

	@Override
	public void carregaImagem(String nomeImagem) {
		if(nomeImagem.equalsIgnoreCase("BMP")) {
			Advanceimage = new ImagemBMP();		
		}else if(nomeImagem.equalsIgnoreCase("JPeg")) {
			Advanceimage = new ImagemJPeg();
		}else if (nomeImagem.equalsIgnoreCase("PNG")) {
			Advanceimage = new ImagemPNG();
		}
		
		
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		
		
	}

}
