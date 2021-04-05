package Fifth2.JavaLearning.JavaLearning.Strings;

public class Count_Sum_OfDigits {

	public static void main(String[] args) {
		int num =12345;
		int sum =0;
		while(num>0){
			int rev = num%10;
			sum=sum+rev;
			num=num/10;
		}
			System.out.println(sum);
			
			
			int num1 =12345;
			System.out.println(sumnum(num1));
	}
	public static int sumnum(int i){
		if(i>0){
			return i%10 + sumnum(i/10);
		}
		return i;
	}
}
