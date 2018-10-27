package br.com.map.templatMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Digitou um nome: ");	
    	String nome = in.readLine();
    	StringTampletMethod templet1 = new StringMinusculo();
    	System.out.println(templet1.StringTemplate(nome));
    	
    	StringTampletMethod templet2 = new StringMaiuscula();
    	System.out.println(templet2.StringTemplate(nome));
    	
    	StringTampletMethod templet3 = new StringInvert();
    	System.out.println(templet3.StringTemplate(nome));
    	
    	StringTampletMethod templet4 = new StringDuplicada();
    	System.out.println(templet4.StringTemplate(nome));
    	
	}

}
