package br.com.proxy;

public class BancoProxy implements BancoUsuarios  {
	
	protected String usuario, senha;
	private int quantidadeDeUsuarios;
	private int usuariosConectados;


	public BancoProxy(String usuario, String senha, int quantidadeDeUsuarios,int usuariosConectados) {
		this.usuario = usuario;
		this.senha = senha;
		this.quantidadeDeUsuarios = (int) (Math.random() * 100);
		this.usuariosConectados = (int) (Math.random() * 10);
		
	}

	@Override
	public String getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return new String("Total de usuários: " + quantidadeDeUsuarios)+ getNumeroDeUsuarios();
		}
		return null;
	}

	@Override
	public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return  new String("Usuários conectados: " + usuariosConectados)+ getUsuariosConectados();
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
