package Session_05;

public class Exercise_05 {
	public static void main(String[] args) {
		int a = 4;
		int b = 10;
		int ctr;
		
		if(a < b) {
			for(ctr = a; ctr <= b; ctr++) {
				if(ctr % 2 == 0) {
					System.out.println("The first number \"divisible by 2\" is " + ctr);
					break;
				}
			}
		}
		
		
	}

}
