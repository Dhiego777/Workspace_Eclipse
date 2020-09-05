
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contadaMarcela = new Conta ();
		System.out.println(contadaMarcela.getSaldo());
		
		contadaMarcela.titular = new Cliente();
		System.out.println(contadaMarcela.titular);
		
		contadaMarcela.titular.nome = "Marcela";
		System.out.println(contadaMarcela.titular.nome);
		
		
	}
}
