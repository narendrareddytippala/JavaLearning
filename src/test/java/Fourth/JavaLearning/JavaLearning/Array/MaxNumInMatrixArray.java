package Fourth.JavaLearning.JavaLearning.Array;

public class MaxNumInMatrixArray {

	public static void main(String[] args) {
		int[][] a = { { 2, 4, 5 }, 
				    { 3, 4, 7 }, 
				    { 11, 2, 1 } };
		int max =a[0][0],min=a[0][0];
		int maxcol =0,mincol =0;
		for(int i=0;i<a.length;i++){
			for(int j = 0;j<a.length;j++){
				if(a[i][j]<min){
					min=a[i][j];				
					for(int k=0;k<a.length;k++){
						if(a[k][j]>maxcol){
							maxcol=a[k][j];
						}
					}
				}
				
				if(a[i][j]>max){
					max=a[i][j];
					mincol=max;
					for(int l=0;l<a.length;l++){
							if(a[l][j]<mincol){
								mincol=a[l][j];
						}
					}
				}
			}
		}
		System.out.println("Min Num is: "+min);
		System.out.println("MaxCol Num is: "+maxcol);
		System.out.println();
		System.out.println("Max Num is: "+max);
		System.out.println("MinCol Num is: "+mincol);
		
	}
}
