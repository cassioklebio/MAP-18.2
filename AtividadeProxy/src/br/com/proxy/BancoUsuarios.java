package br.com.proxy;

public class BancoUsuarios {
	
	private int quantidadeDeUsuarios;
	private int usuariosConectados;

	public BancoUsuarios() {
		quantidadeDeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 10);
	}

	public Integer getNumeroDeUsuarios() {
		return quantidadeDeUsuarios;
	}

	public Object getUsuariosConectados() {
		return new String("Usuários conectados: " + usuariosConectados);
	}
}