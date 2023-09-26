package Session_06;

public class Exercise_07 {
	public static void main(String[] args) {
		String text1 = "password: x12Fgfa";
		String text2 = "x12Fgfa password";

		// Exercise_07.1
		System.out.println("Exercise_07.1");
		System.out.println(text1.substring(text1.indexOf(":")+2));

		System.out.println("\n-----------------------");

		// Exercise_07.2
		System.out.println("Exercise_07.2");
		System.out.println(text2.substring(0,text2.indexOf("password")-1));

		System.out.println("\n-----------------------");

		// Exercise_07.3
		System.out.println("Exercise_07.3");
		String a = "Automation";
		String b = "Auto";

		if (a.equals(b)) {
			System.out.println("a equal b");
		} else if (a.contains(b)) {
			System.out.println("a contains b");
		} else {
			System.out.println("a not equal b");
		}
	}

}
