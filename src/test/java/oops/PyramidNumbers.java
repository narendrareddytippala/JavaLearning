package oops;

public class PyramidNumbers {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}
		
		
		System.out.println();
		int b=1;
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(b);
				System.out.print("\t");
				b++;
			}
			System.out.println();
		}
		
	}

}
