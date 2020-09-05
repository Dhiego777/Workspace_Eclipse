import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double N = sc.nextDouble();
		
		int PosN = 0;
		int NegN = 0;
		int ZeroN = 0;
		
		for (int i=0; i<N; i++) {
			int numb = sc.nextInt();
			
			if ( numb>0) {
				PosN += 1;
			}
				else if (numb <0) {
					NegN += 1;
				}	
					else {
						ZeroN += 1;
					}
		}
	System.out.println(PosN/N);
	System.out.println(NegN/N);
	System.out.println(ZeroN/N);
			
		sc.close();
	
}
}
