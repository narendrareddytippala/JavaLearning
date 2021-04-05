package Fourth.JavaLearning.JavaLearning.Strings;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		int num = 1235678;
		int even = 0, odd = 0;
		while(num>0){
			int rev = num%10;
			num=num/10;
			if(rev%2==0){
				even++;
			}
			else{odd++;}
		}
System.out.println("Even nums are :"+even);
System.out.println("Odd nums are :"+odd);
	}

}
