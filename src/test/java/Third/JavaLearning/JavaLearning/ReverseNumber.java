package Third.JavaLearning.JavaLearning;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;
		int rev =0;
		while (num>0){
			rev= rev*10+(num%10);
			num=num/10;
		}
			System.out.println(rev);
			
		String a = "happy";	
		String b = "testing";
		a=a+b;
		b= a.substring(0,a.length()-b.length());
		a= a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}
