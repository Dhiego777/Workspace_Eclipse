package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		
		List <Conta> lista = new LinkedList <Conta> (); //Criando uma lista que só aceita Conta  <> = Generics
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(223, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(212, 33);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(122, 44);
		lista.add(cc4);
	
		System.out.println(lista.size());
	
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
	
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		for(int i = 0; i<lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("-----------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
