import java.util.Scanner;
public class Saircase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
		
			int j = N;
			
			while (j-- > i) {
				System.out.print(" ");
			}
			while (j-- >=0) {
				System.out.printf("#");
			}
			System.out.println();	
		}
			
		sc.close();
	}
}
