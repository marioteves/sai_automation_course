package Session_06;

public class Exercise_06 {
	public static void main(String[] args) {
		int[] myNum = {3,4,6,7,2,3};
		for(int i = (myNum.length - 1); i < myNum.length; i--) {
			System.out.print(myNum[i] + ",");
			if(i < 1) {
				break;
			}
		}
	}

}
