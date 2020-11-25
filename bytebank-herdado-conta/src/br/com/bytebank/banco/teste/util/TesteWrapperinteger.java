package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperinteger {
	public static void main(String[] args) {
		
		
		int idade = 29; //Integer por baixo dos panos cria uma referencia para uma primitivo(inteiros), assim criando um objeto 
		Integer idadeRef = Integer.valueOf(29); //autoboxing 
		System.out.println(idadeRef.doubleValue());	
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		
		
		int valor = idadeRef.intValue(); //para fazer o unboxing 
		String s = args [0];//"10"
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef); //Autoboxing primitivo para objeto ou vice versa
		//numeros.add(29); por baixos dos panos acontece - numeros.add(Intege.valueOf(29));
		
		
	}
	
}
