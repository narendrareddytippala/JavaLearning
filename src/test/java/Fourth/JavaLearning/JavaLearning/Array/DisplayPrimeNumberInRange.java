package Fourth.JavaLearning.JavaLearning.Array;

public class DisplayPrimeNumberInRange {

	public static void main(String[] args) {
		int rangfrom = 20;
		int rangto =50;
		for(int i=rangfrom;i<=rangto;i++){
			boolean status = true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					status = false;
				}
			}
			if(status){
				System.out.println(i);
			}
		}
	}
}
