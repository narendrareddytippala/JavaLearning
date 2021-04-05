package JavaLearning.JavaLearning;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 18;
		int count = 0;
		if(num>0){
			for(int i=1;i<=num;i++){
				if(num%i==0){
					count++;
				}
			}
			if(count==2){
				System.out.println("Its  Prime");
			}
			else{
			System.out.println("Its not Prime");
			}
		}
		else{System.out.println("Not valid one");}
		
		
		System.out.println("------------");
		for(int i=2;i<num;i++){
			if(num%i==0){
				System.out.println("Its  not Prime");
			}
		}
	}
}
