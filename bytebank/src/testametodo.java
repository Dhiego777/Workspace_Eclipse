
public class testametodo {
	
	public static void main(String[] args) {
		
		Conta contadoPaulo = new Conta();
		contadoPaulo.saldo = 100;
		contadoPaulo.deposita(50);  //nomedareferencia.nomedometodo(30.0); 
		System.out.println(contadoPaulo.saldo);
		
		boolean conseguiuRetirar = contadoPaulo.saca(20);
		System.out.println(contadoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contadaMarcela = new Conta();
		contadaMarcela.deposita(1000);
		
		if(contadaMarcela.transfere(300, contadoPaulo)) {  //if funciona aqui por é uma expressao boolean
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro ");
		}
		System.out.println(contadaMarcela.saldo);
		System.out.println(contadoPaulo.saldo);
		
		contadoPaulo.titular = "Paulo Silveira";
		System.out.println(contadoPaulo.titular);
	}

}
