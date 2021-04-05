package JavaLearning.JavaLearning;

public class SumofNumber {

	public static void main(String[] args) {
		int num = 1234;
		int count = 0;
		while(num>0){
			int getnum = num%10;
			count+=getnum;
			num=num/10;
		}
		System.out.println(count);
	}

}
