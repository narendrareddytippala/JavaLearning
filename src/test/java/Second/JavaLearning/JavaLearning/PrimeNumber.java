package Second.JavaLearning.JavaLearning;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 4;
		int count=0;
		for(int i =1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("Its Prime number");
		}else{	System.out.println("Its not Prime number");}
	}
}
