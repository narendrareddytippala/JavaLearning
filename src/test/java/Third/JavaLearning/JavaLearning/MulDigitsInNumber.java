package Third.JavaLearning.JavaLearning;

public class MulDigitsInNumber {

	public static void main(String[] args) {
		int num = 12345;
		int mul=1;
		while(num>0){
			mul=mul*(num%10);
			num=num/10;
		}
		System.out.println(mul);
	}
}
