import java.util.Scanner;

public class MatrizQuadrada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantidade de colunas e linhas: ");
		int N = sc.nextInt();
		int [][] mat = new int [N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				mat [i][j] = sc.nextInt();
				
			}
		}
		
		System.out.printf("Diagonal Principal: ");
		for (int i=0; i<N; i++) {
			System.out.print(mat[i][i]+ " ");
		}
		System.out.println();
		
		int cont = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (mat [i][j] < 0) {
					cont = cont +1;
				}
			}
		}
		
		System.out.println("Quantidade de negativos = " + cont);
		
		sc.close();
	}
}
