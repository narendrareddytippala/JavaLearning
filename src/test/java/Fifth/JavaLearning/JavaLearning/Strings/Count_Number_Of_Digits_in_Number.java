package Fifth.JavaLearning.JavaLearning.Strings;

public class Count_Number_Of_Digits_in_Number {

	public static void main(String[] args) {
		int num = 123456;
		int count=0;
		while(num>0){
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
