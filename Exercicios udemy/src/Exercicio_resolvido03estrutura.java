import java.util.Scanner;

public class Exercicio_resolvido03estrutura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println("O menor numero � : " + a);
		}
		else if (b < c) {
			System.out.println("O menor numero � : " + b);
		}
		else {
			System.out.println("O menor numero � : " + c);
		}
		
			
		sc.close();
	}
}
