package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String[] args) {
		
	
		String vazio = "       Alura         ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		
		String nome = "Alura";// object literal -- string � imutavel
		//String outro = new String("Alura");
		
		System.out.println(nome.length());
		
		for(int i = 0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(0);
//		System.out.println(c);
		
//		char c = 'A';
//		char d = 'a';
//		String outra = nome.replace('c', 'd'); //--trocar letra A por letra minuscula a
		
	    //String outra = nome.toLowerCase();  //--letra minuscula 
		//String outra = nome.toUpperCase(); //--letra maiuscula
//		
//		System.out.println(nome);
//		System.out.println(outra);
	}
}
