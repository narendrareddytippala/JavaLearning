package Fourth.JavaLearning.JavaLearning.Array;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int sum=0;
		for(int b: a){
			sum=sum+b;
		}
		System.out.println(sum);	
	}
}
