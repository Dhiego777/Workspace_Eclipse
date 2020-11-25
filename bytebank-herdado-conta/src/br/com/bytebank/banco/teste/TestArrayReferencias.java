package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
		
		//int[] idades = new int[5]
		Object[] referencias = new Object[5]; 
		
		
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);  //referencia - tipo = new - Contrutor (Parametros)
		
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);   
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());
//		Object referenciaGenerica = contas[1];
//		System.out.println( referenciaGenerica.getNumero());
		
		
	//	System.out.println(referencias[0].getNumero());
	//	System.out.println(referencias[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];  //tupe cast transforma uma referencia do tipo conta generica em um tipo especifico ali no final entre parenteses
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}

}
