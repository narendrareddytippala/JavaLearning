package JavaLearning.JavaLearning;

public class GetMinNumFromMatrix2 {

	public static void main(String[] args) {
//		int a[][]={{7,12,1},
//				   {5,7,6},
//				   {11,15,19}};
		int[][] a = {{2,4,5},
				 {3,4,7},
				 {11,2,1}};
		int min = a[0][0];
		int max = 0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]<=min){
					min = a[i][j];
					for(int k=0;k<a.length;k++)	{
						max=0;
						if(a[k][j]>max){
							max = a[k][j];
							//System.out.println(max);
						}
						
					}				
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
