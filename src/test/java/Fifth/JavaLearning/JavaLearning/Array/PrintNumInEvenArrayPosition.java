package Fifth.JavaLearning.JavaLearning.Array;

public class PrintNumInEvenArrayPosition {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5,6};
		for(int i=1;i<a.length;i=i+2){
			System.out.println(a[i]);
		}
	}

}
