package JavaLearning.JavaLearning;

public class FindEvenAndOdd {

	public static void main(String[] args) {
		int num = 1234567;
		int even = 0;
		int odd = 0;
		while(num>0){
			int getnum = num%10;
			if(getnum%2==0){
				even++;
			}
			else{odd++;}
			num=num/10;
		}
		System.out.println("Even :"+even+" Odd :"+odd);

	}

}
