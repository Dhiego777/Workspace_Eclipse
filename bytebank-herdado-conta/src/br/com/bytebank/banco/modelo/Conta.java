package br.com.bytebank.banco.modelo; 


/**
 * Classe representa a moldura de uma conta 
 * 
 * @author Dhiego
 *
 */

 //Ctrl+Shift+C comentar tudo 
public abstract class Conta {  // 	classe 
	protected double saldo;  // 		atributo
	private int agencia;	// 		atributo
	private int numero;		// 		atributo
	private Cliente titular;		//	atributo
	private static int total; //static: da classe, ele n vai ficar 1 sempre que criar uma nova conta, pq ele é separado dos atributos 
	
	/**
	 * Contrutor para inicializar o objeto Conta a partir da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.agencia + " " +this.numero);
	}
	
	public abstract void deposita(double valor);  
		

	/**
	 * Calor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
			
		}
		
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino ) throws SaldoInsuficienteException{
		this.saca(valor); 
		destino.deposita(valor);
			
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
	
	@Override
	public boolean  equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {

		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
	
	
}
	