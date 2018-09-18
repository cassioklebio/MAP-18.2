package br.com.proxy;

public class BancoProxy implements InterfaceBanco  {
	
	protected String usuario, senha;
	private BancoUsuarios banco;
	


	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		
		
	}


	public int getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return banco.getNumeroDeUsuarios();
		}
		return (Integer) null;
	}

	
	public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return  (String) banco.getUsuariosConectados();
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
