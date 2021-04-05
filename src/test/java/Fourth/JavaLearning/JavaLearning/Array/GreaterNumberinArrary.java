package Fourth.JavaLearning.JavaLearning.Array;

public class GreaterNumberinArrary {

	public static void main(String[] args) {
		int a[] = { 5, 8, 2, 19, 6, 1, 12, 16, 15, 14 };
		int max = a[0];
		for(int i:a){
			if(i>max){
				max=i;
			}
			}
		System.out.println(max);
	}

}
