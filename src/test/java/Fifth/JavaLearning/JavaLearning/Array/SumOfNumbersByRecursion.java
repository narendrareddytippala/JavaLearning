package Fifth.JavaLearning.JavaLearning.Array;

public class SumOfNumbersByRecursion {

	public static void main(String[] args) {
		int num = 5;
		int sum =count(num);
		System.out.println(sum);

	}
		public static int count(int i){
			if(i!=0){
				return i+count(i-1);
			}
			else
			return i;
		}
}
