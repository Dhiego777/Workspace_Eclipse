public class Conta {  // 	classe 
	private double saldo;  // 		atributo
	private int agencia;	// 		atributo
	private int numero;		// 		atributo
	private Cliente titular;		//	atributo
	private static int total; //static: da classe, ele n vai ficar 1 sempre que criar uma nova conta, pq ele é separado dos atributos 
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.agencia + " " +this.numero);
	}
	
	public void deposita(double valor) {  //metodo
		if (valor <=0) {
			System.out.println("Não pode depositar valor negativo");
			return;
		}
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
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		//usando esse metodo pode criar varios if como: tem q ficar dentro de 0-1000, n pode colocar negativo 
		if(numero <= 0 ) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return; //não precisa colocar nada depois do return pq é void 
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	
	
}
	