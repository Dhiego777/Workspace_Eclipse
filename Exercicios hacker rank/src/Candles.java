import java.util.Scanner;

public class Candles {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Maxheight = 1;
		int countMax = 0;
		
		for (int i=0; i<N; i++) {
			int height = sc.nextInt();
			
			
			if (height > Maxheight) {
			Maxheight = height;
			countMax = 1;
			}
			
			else if (height == Maxheight) {
				countMax++;
			}
		}
		System.out.println(countMax);
		sc.close();
	}
}
