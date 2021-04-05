package Fifth2.JavaLearning.JavaLearning.Strings;

public class Count_Number_Of_Digits_in_Number {

	public static void main(String[] args) {
		int num= 56789321;
		int count =0;
		while(num>0){
			count++;
			num=num/10;
		}
		System.out.println(count);
		
		
		int num1= 567894321;
		System.out.println(cou(num1));
	}
	public static int cou(int i){
		if(i>0){
			return 1+cou(i/10);
		}
		return i;
	}
}
