import java.util.Scanner;

public class Explicacao_aula34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		System.out.print("Que horas s�o ? ");
		hora = sc.nextInt(); 
		
		if (hora < 12) {
			System.out.println("Bom Dia");
		}
		else {
			if (hora < 18) {
				System.out.println("Boa Tarde" );
			}	
			else {
				System.out.println("Boa noite");
			}
		    }
		sc.close();
}
}