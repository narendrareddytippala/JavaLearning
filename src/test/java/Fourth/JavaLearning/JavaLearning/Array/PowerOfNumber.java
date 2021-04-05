package Fourth.JavaLearning.JavaLearning.Array;

public class PowerOfNumber {

	public static void main(String[] args) {
		int num = 3;
		int per = 4;
		int mul =1;
		for(int i=1;i<=per;i++){
			mul=mul*num;
		}
		System.out.println(mul);
		
		
		int num1 =3;
		int per1 =4;
		int rel =1;
		while(per1!=0){
			rel=rel*num1;
			per1--;
		}
		System.out.println(rel);
		
		System.out.println(Math.pow(3, 4));
	}
}
