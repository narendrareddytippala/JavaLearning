package Third.JavaLearning.JavaLearning;

public class EvenOddInArrary {

	public static void main(String[] args) {
		int a[]={3,9,5,6,7,8};
		int even = 0, odd =0;
		for(int b:a){
			int c = (b%2==0)? even++:odd++;
		}
		System.out.println("Even "+even+" Odd "+odd);
	}
}
