package project;

public class Challenge13 {

	public static void main(String[] args) {

		int num1 =0;
		int num2 =0;
		
		for(num1 =0; num1 <10; num1++) {
			
			if(num1 %2 !=0) {
				continue;
			}
			for(num2 =1; num2 < 10; num2++) {
				
				if((num1<num2)|| ((num1%2 ==0) && (num1%3==0))) {
					System.out.println();
					break;
					
				}
				System.out.println(num1*num2);
				
			}
			
			
		}

	}

}
