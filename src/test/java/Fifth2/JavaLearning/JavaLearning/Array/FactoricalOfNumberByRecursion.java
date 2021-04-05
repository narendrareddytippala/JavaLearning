package Fifth2.JavaLearning.JavaLearning.Array;

public class FactoricalOfNumberByRecursion {

	public static void main(String[] args) {
		int num=5;
		int res=fact(num);
		System.out.println(res);

	}
	public static int fact(int i){
		if(i>1){
			return i*fact(i-1);
		}
		return i;
	}
}
