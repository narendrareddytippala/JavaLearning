package Fourth.JavaLearning.JavaLearning.Array;

public class EvenAndOddInMatrix {

	public static void main(String[] args) {
		int a[][] = {{3,6,9},{1,5,8},{4,7,2}};
		int even = 0, odd=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]%2==0){
					even++;
				}
				else{odd++;}
			}
		}
		System.out.println("Even are: "+even);
		System.out.println("Odd are: "+odd);
	}

}
