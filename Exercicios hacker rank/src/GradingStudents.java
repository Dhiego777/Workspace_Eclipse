import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int gradeslenght = sc.nextInt();
		int [] grades = new int [gradeslenght];
		
		for (int i=0; i<gradeslenght; i++) {
			grades [i] = sc.nextInt();
			
			if (grades [i] >=38) {
				int remainder = grades[i] % 5;
				int least_multiple = grades[i] - remainder;
				int upper_multiple = least_multiple + 5;
				int diferente = upper_multiple - grades[i];
				
				
				
		         if (grades[i] % 5 >=3 ){
		             grades[i] += + (grades[i] % 5) - 1;
		             
		         
		             
		         }
		     }
			
			System.out.println(grades[i]);
		 }

		 
		 
	sc.close();
	}
}

/*
67 % 5 = 2
68 % 5 = 3 

for(int i=0; i <grades.length; i++) {

if (grades [i] >=38) {
   int remainder = grades[i] % 5;
   int least_multiple = grades [i] - remainder;
   int upper_multiple = least_multiple + 5;
   int difference = upper_multiple - grades [i];
            
   if(difference < 3) {
       grades [i] = upper_multiple;
   }
}
}
return grades;

*/