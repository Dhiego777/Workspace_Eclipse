import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Largura: ");
		double largura = sc.nextDouble();
		System.out.print("Comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.print("Preço do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado; 
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
		
		sc.close();

	}

}