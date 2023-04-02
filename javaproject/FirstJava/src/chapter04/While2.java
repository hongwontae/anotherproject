package chapter04;

public class While2 {

	public static void main(String[] args) {
		
		int num = 1;
		while (num<10) {
			
			int n =2;
			while(n<10) {
				System.out.print(n+ "x"+num);
				n++;
			}
			
//			System.out.println("2x"+num+"="+num*2);
//			System.out.print("2x"+num+"="+num*2);
//			System.out.print("\t 3x"+num+"="+num*3);
//			
//			//....
//			System.out.print("\t 4x"+num+"="+num*4);
//			System.out.print("\t 5x"+num+"="+num*5);
			
			System.out.println();
			num++;
		}
	}

}
