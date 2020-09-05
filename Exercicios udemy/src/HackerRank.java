import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int [] a = new int [3];
		int [] b = new int [3];
		
		for (int i=0; i<3; i++) {
			a [i] = sc.nextInt();		
		}
		for (int i=0 ; i<3; i++) {
			b [i] = sc.nextInt();
		}
		
		int PontosAlice = 0;
		int PontosBob = 0;
		
		for (int i=0; i<3; i++) {
			if (a[i]>b[i]) {
				PontosAlice +=1;	
			}
			else if (a[i]<b[i]) {
				PontosBob +=1;
			}
		}
		
		System.out.printf("%d %d",PontosAlice, PontosBob);
		sc.close();
	}
}
