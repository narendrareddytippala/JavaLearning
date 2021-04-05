package Fifth.JavaLearning.JavaLearning.Array;

public class FactoricalOfNumberByRecursion {

	public static void main(String[] args) {
		int num =6;
		int result=fact(num);
		System.out.println(result);
	}
	public static int fact(int i){
		if(i>1){
			return i*fact(i-1);
		}
		else{
			return i;
		}
		
	}
}
