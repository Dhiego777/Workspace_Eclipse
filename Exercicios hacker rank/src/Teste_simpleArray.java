import java.util.Scanner;

public class Teste_simpleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  	
			System.out.printf("Quantidade de Nº: ");
	        int N = sc.nextInt();
	        int [] vet = new int [N];
	        int soma = 0;

	        for (int i=0; i<N; i++){
	            vet [i] = sc.nextInt();
	            soma += vet [i];
	        }

	        System.out.println(soma);
	        
	        sc.close();

	}

}
