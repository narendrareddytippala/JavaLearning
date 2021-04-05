package NewTest.checking.Array;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 6;
		boolean status = true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				status = false;
			}
		}
		if(status)
			System.out.println(num+" is Prime number");
		else
			System.out.println(num+" is not Prime number");
	}

}
