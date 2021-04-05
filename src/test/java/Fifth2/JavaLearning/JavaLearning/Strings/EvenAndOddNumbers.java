package Fifth2.JavaLearning.JavaLearning.Strings;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		int num = 1235678;
		int even=0,odd=0;
		while(num>0){
			int rev = num%10;
			if(rev%2==0)
				even++;
			else
				odd++;
			num=num/10;
		}
		System.out.println("Even count is "+even);
		System.out.println("Odd count is "+odd);
	}

}
