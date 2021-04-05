package Second.JavaLearning.JavaLearning;

public class GetNumberOfUpperAndSmallAndDigits {

	public static void main(String[] args) {
		String aa = "India is my country 100%";
	
		int totalChar = aa.length();
		int upperCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int others = 0;
		for (int i = 0; i < totalChar; i++) {
			char a = aa.charAt(i);
			if (Character.isUpperCase(a)) {
				upperCase++;
			} else if (Character.isLowerCase(a)) {
				lowerCase++;
			} else if (Character.isDigit(a)) {
				digits++;
			} else {
				others++;
			}
		}
		
		System.out.println("Cap: "+upperCase);
		System.out.println("Small: "+lowerCase);
		System.out.println("Num: "+digits);
		System.out.println("others: "+others);
	}

}
