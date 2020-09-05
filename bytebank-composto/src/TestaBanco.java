
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		Conta contadoPaulo = new Conta();
		contadoPaulo.deposita(100);
		
		
		//associa o cliente paulo a conta contadoPaulo
		contadoPaulo.titular = paulo;
		
		System.out.println(contadoPaulo.titular.nome);
		System.out.println(contadoPaulo.titular);
		System.out.println(paulo);
	}
}
