import java.util.Scanner;

public class For_teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Numero de vezes para repetir o programa: ");
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<N; i = i+1) { // ou i++ 
			System.out.printf("Coloque um numero: ");
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println("Somatoria igual a: " + soma);
		
		sc.close();
	}
}
