package project;

public class Challenge12 {

	public static void main(String[] args) {
		
		int num = 0;
		int count = 0;
		int sum = 0;
		
		
	while(true) {
		
		if (num %2 !=0) {
			
			sum += num;
			count++;
			
		}
		else if ((num %2 ==0) && (num %3 == 0)){ 
			
			sum += num;
			count++;
     	}
	
		if (sum >1000) {
			
			System.out.println(sum);
			System.out.println(count);
			break;
		}
		num++;
	}

	}

}
