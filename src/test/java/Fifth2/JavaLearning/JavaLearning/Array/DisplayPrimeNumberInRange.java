package Fifth2.JavaLearning.JavaLearning.Array;

public class DisplayPrimeNumberInRange {

	public static void main(String[] args) {
		int rfrom= 10;
		int rto = 30;
		
		for(int i=rfrom;i<=rto;i++){
			boolean status = false;
			for(int j=2;j<i;j++){
				if(i%j==0){
					status = true;
				}
			}
			if(!status){
				System.out.println(i);
			}
		}
	}
}
