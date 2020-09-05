import java.util.Scanner;

public class DiagonalMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int [][] mat = new int [N][N];
		
		for (int i=0; i<N; i++ ) {
			for (int j=0; j<N; j++) {
				mat[i][j] =sc.nextInt();
			}
		}
		
		int diagPrin = 0;
		int diagSec = 0;
		
		for (int i=0; i<N; i++) {
			diagPrin += mat[i][i];
		}
	
		for (int i=0; i<N; i++) {
			diagSec += mat [i][];
		}
		sc.close();
	}
}
