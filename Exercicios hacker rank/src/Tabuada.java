import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Tabuada do: ");
		int N = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int resultado = i * N;
			System.out.printf("%d x %d = %d%n", N, i, resultado);
			
		}
		
		sc.close();
	}
}
