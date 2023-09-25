package Session_06;

public class Exercise_07 {
	public static void main(String[] args) {
		String text1 = "x12Fgfa";
		String text2 = "password";
		
		System.out.println("Exercise_07.1");
		System.out.println(text2 + ": ".concat(text1));
		
		System.out.println("\n");
		
		System.out.println("Exercise_07.2");
		System.out.println(text1 + " ".concat(text2));
		
		System.out.println("\n");
		
		System.out.println("Exercise_07.3");
		String a ="Automation";
		String b ="Auto";
		
		if(a==b) {
			System.out.println("a equal b");
		}else {
			if (a.contains(b)) {
				System.out.println("a contains b");
			} else if(a != b){
				System.out.println("a not equal b");
			}
		}
	}

}
