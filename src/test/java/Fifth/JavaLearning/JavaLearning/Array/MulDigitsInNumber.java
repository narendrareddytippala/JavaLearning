package Fifth.JavaLearning.JavaLearning.Array;

public class MulDigitsInNumber {

	public static void main(String[] args) {
		int num = 12345;
		int mul =1;
		while(num>0){
			int rev = num%10;
			mul=mul*rev;
			num=num/10;
		}
		System.out.println(mul);
		
		
	// Using recursion
		int num1 = 12345;
		int num2 = mul(num1);
		System.out.println(num2);
	}
	public static int mul(int i){
		if(i>1){
			return i%10*mul(i/10);
		}
		else{
			return i;
		}
	}
}
