package Fifth2.JavaLearning.JavaLearning.Array;

public class SumOfNumbersByRecursion {

	public static void main(String[] args) {
		int num=5;
		System.out.println(sum(num));
	}
	public static int sum(int i){
		if(i!=0){
			return i+sum(i-1);
		}
		return i;
	}

}
