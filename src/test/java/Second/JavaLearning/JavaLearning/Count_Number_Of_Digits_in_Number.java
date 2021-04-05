package Second.JavaLearning.JavaLearning;

public class Count_Number_Of_Digits_in_Number {

	public static void main(String[] args) {
		int num = 2356789;
		int count=0;
		while(num>0){
			num=num/10;
			count++;
		}
		System.out.println("Count is "+count);
	}

}
