package NewTest.checking.Array;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 370;
		int temp = num;
		int mul=0;
		while(num>0){
			int rev = num%10;
			num = num/10;
			mul = mul+(rev*rev*rev);
		}
		if(temp==mul){System.out.println("Number is Armstrong");}
		else{System.out.println("Number is not Armstrong");}
	}

}
