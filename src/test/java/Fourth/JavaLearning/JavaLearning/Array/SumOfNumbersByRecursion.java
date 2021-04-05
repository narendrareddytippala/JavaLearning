package Fourth.JavaLearning.JavaLearning.Array;

public class SumOfNumbersByRecursion {

	public static void main(String[] args) {
		int num = 5;
		int sum = count(num);
		System.out.println(sum);

	}
	public static int count(int num){
		if(num!=0){
			return num + count(num-1);
			} 
		else{
			return num;
		}
	}
}
