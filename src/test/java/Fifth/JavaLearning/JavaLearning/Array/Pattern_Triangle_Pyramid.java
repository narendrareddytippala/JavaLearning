package Fifth.JavaLearning.JavaLearning.Array;

public class Pattern_Triangle_Pyramid {

	public static void main(String[] args) {
		//Right Triangle
		for(int i=1;i<=5;i++){
				for(int j=1;j<=i;j++){
					System.out.print("*");
					System.out.print("\t");
				}
				System.out.println();
			}
			System.out.println("--------------------");
			for(int i=5; i>=1;i--){
				for(int j=1;j<=i;j++){
					System.out.print("*");
					System.out.print("\t");
				}
				System.out.println();
			}
			
		//Left Triangle
		for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}
