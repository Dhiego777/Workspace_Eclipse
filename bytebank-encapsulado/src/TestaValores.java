
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 77777);
		
		conta.setAgencia(-50);
		conta.setNumero(-330);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 77757);
		System.out.println(Conta.getTotal());
	}

}
