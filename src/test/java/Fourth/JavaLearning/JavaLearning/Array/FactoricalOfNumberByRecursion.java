package Fourth.JavaLearning.JavaLearning.Array;

public class FactoricalOfNumberByRecursion {

	public static void main(String[] args) {
		int num =5;
		int fact = factnum(num);
		System.out.println(fact);
	}
	public static int factnum(int i){
		if(i>1){
			return i*factnum(i-1);
		}
		else{return i;}
	}
}
