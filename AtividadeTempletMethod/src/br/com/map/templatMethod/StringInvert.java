package br.com.map.templatMethod;

public class StringInvert extends StringTampletMethod {
	
	public String mudaString(String nome){
		int i, len = nome.length();
	    StringBuilder invert = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        invert.append(nome.charAt(i));
	    }

	    return invert.toString();
	}

}

