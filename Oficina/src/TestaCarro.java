
public class TestaCarro {
		public static void main(String[] args) {
			
			Carro carro1 = new Carro(2019, "Gol", 35000.0);
			carro1.setAno(2013);
			carro1.setPreco(30000.0);
			System.out.println(carro1.getAno() + " " + carro1.getPreco());
			
			Caracteristica dhiego = new Caracteristica();
			dhiego.setDono("Dhiego Cavalcante");
			dhiego.setCpf("777.777.777-77");
			dhiego.setProfissao("Programador");
			
			carro1.setTitular(dhiego);
			System.out.println(carro1.getTitular().getDono());
			
		}
}
