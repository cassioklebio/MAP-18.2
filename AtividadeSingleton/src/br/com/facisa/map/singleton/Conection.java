package br.com.facisa.map.singleton;


import java.sql.DriverManager;



public class Conection {
	
	private static  Conection conexao = null;
	private static  Conection stm = null;
	private static String url = "localhost:5050/map";
	private static String username = "cassio";
	private static String password  = "999999999999";
	
	
	private static Conection getConexao() {
		if(conexao == null) {
			try {
				conexao = (Conection) DriverManager.getConnection(url, username, password);
			} catch (Exception e) {
				 System.out.println("Houve um erro ao conectar com o Banco de Dados.");
			}
		}
		return conexao;
	}
	
	
	public static synchronized Conection getInstancia() {
		if(stm == null) {
			return new Conection();
		}else {
			return stm;
		}
	}
	
	public void QuebraConexao() {
		try {
			getConexao().clone();
		} catch (Exception e) {
			System.out.println("Houve um erro ao desconectar o banco");
		}
	}
	
	

}
