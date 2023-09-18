package Session_03;

public class Exercise_03 {
	public static void main(String[]args) {
		int num1 = 150;
		int num2 = 8;
		char mathOperator = '/';
		
		switch (mathOperator) {
		case '+':
			System.out.println("Addition");
			System.out.println(num1 + " plus " + num2 + " is equal to " + (num1 + num2));
			break;
		case '-':
			System.out.println("Subtraction");
			System.out.println(num1 + " minus " + num2 + " is equal to " + (num1 - num2));

			break;
		case '*':
			System.out.println("Multiplication");
			System.out.println(num1 + " times " + num2 + " is equal to " + (num1 * num2));
			break;
		case '/':
			System.out.println("Division");
			System.out.println(num1 + " divided by " + num2 + " is equal to " + (num1 / num2));

			break;
			default:
				System.out.println("Sorry,invalid operator.Please try again...");
		}
	}

}
