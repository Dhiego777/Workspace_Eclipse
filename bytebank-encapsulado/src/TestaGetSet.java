
public class TestaGetSet {
	public static void main(String[] args) {
		
		Conta conta = new Conta (1337, 77777);
		//conta.numero = 1337;
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		Conta conta777 = new Conta (777, 77778);
		//conta777.setNumero(777);
		
		Cliente dhiego = new Cliente ();
		dhiego.setNome("Dhiego Cavalcante");
		
		conta777.setTitular(dhiego);
		System.out.println(conta777.getTitular().getNome());
		conta777.getTitular().setProfissao("programador");
		
		System.out.println(conta777.getTitular().getProfissao());
		
		conta777.deposita(1000);
		System.out.println(conta777.getSaldo());
		conta777.deposita(-50);
		System.out.println(conta777.getSaldo());
	}
}
