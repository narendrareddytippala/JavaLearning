package Fifth.JavaLearning.JavaLearning.Array;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		int num =100;
			count(num);
		    count1(1);

	}
	public static void count(int i){
		if(i>0){
		System.out.println(i--);
		count(i);
		}

	}
	public static void count1(int i){
		if(i<=100){
			System.out.println(i++);
			count1(i);
		}
	}
}
