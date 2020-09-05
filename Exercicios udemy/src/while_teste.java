import java.util.Scanner;

public class while_teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Coloque um nº: ");
		double x = sc.nextDouble();

		double soma = 0;
		while ( x != 0) {
			
			soma = soma + x;
			System.out.printf("Valor atual: %.1f%n", soma);
			System.out.printf("Coloque um nº: ");
			x = sc.nextDouble();
		}
		System.out.printf("Somatoria dos numeros que colocou : %.1f", soma);
		
		sc.close();
	}
}
