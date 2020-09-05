import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Resolvidoestruturacondicional {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Nota do primeiro semestre: ");
		double nota1 = sc.nextDouble();
		System.out.print("Nota do segundo semestre: ");
		double nota2 = sc.nextDouble();
		
		double notafinal = nota1 + nota2; 
		
		if (notafinal >= 60.0) { 
			System.out.printf("Nota final = %.1f%n", notafinal);
			System.out.println("Não fez mais que sua obrigação.");
		}
		else {
			System.out.printf("Nota final = %.1f%n", notafinal);
			System.out.println("Reprovado, Se fudeu.");
		}	
		sc.close();
	}
}
