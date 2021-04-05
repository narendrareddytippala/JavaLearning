package Fifth2.JavaLearning.JavaLearning.Strings;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int num =5;
		int mul =1;
		for(int i=5;i>0;i--){
			mul=mul*i;
		}
		System.out.println(mul);
		
		int num1 =5;
		int mul1 =1;
		while(num1>1){
			mul1=mul1*num1;
			num1--;
		}
		System.out.println(mul1);
		
		int num3 =5;
		System.out.println(fact(num3));
	}
	public static int fact(int i){
		if(i>1){
			return i*fact(i-1);
		}
		return i;
	}
}
