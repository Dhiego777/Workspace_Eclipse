
public class Carro {

	private int ano;
	private String modelo;
	private double preco;
	private Caracteristica titular;
	
	public Carro(int ano, String modelo, double preco) {
		if(ano >= 1891) {
			this.ano = ano;
		} else {
			System.out.println("O ano informado está inválido.");
		}
		
		this.modelo = modelo;
		
		if(preco >=0) {
			this.preco = preco;
		} else {
			System.out.println("Preço invalido");
		}
		System.out.println("O carro cadastrado é :" + ano + " " + modelo + " " + preco);
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Caracteristica getTitular() {
		return titular;
	}
	
	public void setTitular(Caracteristica titular) {
		this.titular = titular;
	}
}

