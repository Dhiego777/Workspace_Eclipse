import java.util.Scanner;

public class Exercicio_proposto_01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);

		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		double area = base * altura;
		double perimetro = (2 * base) + (2 * altura);
		double diagonal = (Math.sqrt((Math.pow(base, 2))+(Math.pow(altura, 2))));
		
		System.out.printf("Area = %.4f%n", area);
		System.out.printf("Perimetro = %.4f%n", perimetro);
		System.out.printf("Diagonal = %.4f%n", diagonal);
		
		sc.close();
	}
}
