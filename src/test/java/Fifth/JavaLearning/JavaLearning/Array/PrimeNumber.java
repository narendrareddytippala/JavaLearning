package Fifth.JavaLearning.JavaLearning.Array;

public class PrimeNumber {

	public static void main(String[] args) {
		int num =6;
		boolean status = false;
		for(int i=2;i<num;i++){
			if(num%i==0){
				status = true;
			}
		}
		if(!status)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
	}

}
