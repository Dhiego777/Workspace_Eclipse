public class Conta {  // 	classe 
	private double saldo;  // 		atributo
	int agencia;	// 		atributo
	int numero;		// 		atributo
	Cliente titular;		//	atributo
	
	public void deposita(double valor) {  //metodo
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino ) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
	