package Fifth2.JavaLearning.JavaLearning.Array;

public class PowerOfNumber {

	public static void main(String[] args) {
		int num = 3;
		int pwr = 4;
		int mul=1;
		System.out.println(Math.pow(num, pwr));
		
		while(pwr!=0){
			mul=mul*num;
			pwr--;
		}
		System.out.println(mul);
	}
}
