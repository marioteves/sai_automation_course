package Session_03;

public class Exercise_02 {
	public static void main(String[]args) {
		int num = 7;
		
		System.out.println("Exercise_02.1");
		if(num % 2 == 0) {
			System.out.println(num + " is an \"even number\"." );
		} else {
			System.out.println(num + " is an \"odd number\" because the modulus operator returns a remainder of " + (num % 2));
		}
		
		System.out.println("--------------------------------------------------------------------------- ");
		
		System.out.println("Exercise_02.2");
		
		String custName = "Lindsay";
		int custAge = 66;
		
		if(custAge <= 10) {
			System.out.println(custName + " has a discount of 20%");
		} else if(custAge > 10 && custAge <= 65) {
				System.out.println(custName + " has a discount of 15%");
			} else {
				System.out.println(custName + " has a discount of 35%");
			}
		}

	}


 