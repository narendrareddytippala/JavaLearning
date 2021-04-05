package Fifth2.JavaLearning.JavaLearning.Array;

public class EvenAndOddInMatrix {

	public static void main(String[] args) {
		int num[][] = {{2,5,7},{1,3,4},{6,8,9}};
		int even=0,odd=0;
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				if(num[i][j]%2==0)
					even++;
				else
					odd++;
			}
		}
				System.out.println("Num of Even are "+even);
				System.out.println("Num of Odd are "+odd);
	}

}
