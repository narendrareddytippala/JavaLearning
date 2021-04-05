package Fifth2.JavaLearning.JavaLearning.Array;

public class Pattern_Triangle_Pyramid {

	public static void main(String[] args) {
		//Left Triangle
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		for(int i=0;i<5;i++){
			for(int j=0;j<5-i;j++){
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		//Right Triangle
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println("");
		}
	}

}
