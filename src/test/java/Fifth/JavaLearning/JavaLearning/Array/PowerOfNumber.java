package Fifth.JavaLearning.JavaLearning.Array;

public class PowerOfNumber {

	public static void main(String[] args) {
		int num = 3;
		int pwr = 4;
		int mul =1;
		while(pwr!=0){
			mul=mul*num;
			pwr--;
		}
		System.out.println(mul);
		System.out.println(Math.pow(3, 4));
	}

}
