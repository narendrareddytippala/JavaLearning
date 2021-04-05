package Second.JavaLearning.JavaLearning;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		int num=12345678;
		int even = 0,odd=0;
		int getnum=0;
		while(num>0){
			getnum=num%10;
			if(getnum%2==0){
				even++;
			}
			else{odd++;}
			num=num/10;
		}
		System.out.println("Number is even are "+even+" And Number of odd are "+odd);
	}
}
