
public class Tabuada2 {
	public static void main(String[] args) {
		
		
		for(int i=0; i<10; i++) {
			//linha
			//for (int linha=0; linha<=10; linha++) 
			for(int j=0; j<10; j++) {
				if(j>i) {
					break;
				}
				//coluna
				System.out.printf("*");
			}
			System.out.println();
			
		}
			
		
	}

}
