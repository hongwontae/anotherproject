package project;

public class Challenge14 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int sum = 0;
		int firstNum=0;
		int secondNum=0;
		for(a = 0; a < 10; a++ ) {
			
			for (b = 0; b < 10; b++) {
			
				if( a == b) {continue;}
				sum = (a*10 +b) +(b*10 +a);
				
				if(sum == 99) {
					firstNum= a*10+b;
					secondNum= b*10+a;
					System.out.println(firstNum + "\n + \n" + secondNum + " \n" + "-------\n" + sum);
					System.out.println();
					
				}
			}
		}

	}

}
