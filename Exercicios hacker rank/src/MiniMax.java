import java.util.Scanner;

public class MiniMax {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
	
		int soma1 = n1+n2+n3+n4;
		int soma2 = n2+n3+n4+n5;
		
		System.out.printf(soma1 + " " + soma2);
		sc.close();
	}
}


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = 0;
        while(scan.hasNext()) {
            long n = scan.nextLong();
            sum = sum + n;
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        scan.close();
        
        System.out.println((sum - max) + " " + (sum - min));
    }
}