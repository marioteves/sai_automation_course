package Session_05;

public class Exercise_04 {
	public static void main(String[] args) {
		
		//Exercise_04.1
		System.out.println("Exercise_04.1 ");
		int a = 4;
		int b = 10;
		int ctr;
		if(a < b) {
			System.out.println("Ascending order");
			for(ctr = a; ctr <= b; ctr++) {
				System.out.print(ctr);
			}
		} 
		
		System.out.println("\n");
		
		//Exercise_04.2
		System.out.println("Exercise_04.2 ");
		int a1 = 4;
		int b1 = 10;
		int ctr1;
		
		if(a1 < b1){
			System.out.println("Descending order");
			for (ctr1 = b1; ctr1 >= a1; ctr1--) {
				System.out.print(ctr1);
			}
		}
		
		//Exercise_04.3
		System.out.println("\n");
		System.out.println("Exercise_04.3 ");
		System.out.println("Divisible by 3");
		int a2 = 4;
		int b2 = 10;
		int ctr2;
		
		
		if(a < b) {
			for (ctr2 = a2; ctr2 <= b2; ctr2++) {
				if(ctr2 % 3 == 0) {
					System.out.print(ctr2 + ",");
				}
				
		}
			
		}
				
	}

}
