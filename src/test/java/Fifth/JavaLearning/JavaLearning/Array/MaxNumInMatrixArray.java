package Fifth.JavaLearning.JavaLearning.Array;

public class MaxNumInMatrixArray {

	public static void main(String[] args) {
		int[][] a = { { 3, 4, 5 }, 
					  { 4, 4, 7 }, 
				   	  { 11, 8, 2 } };
		int min = a[0][0],max = a[0][0];
		int mincol =0, maxcol =0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]>max){
					max=a[i][j];
					mincol=max;
					for(int k=0;k<a.length;k++){
						if(a[k][j]<mincol){
							mincol = a[k][j];
						}
					}
				}
			}
		}
		System.out.println("Max num is "+max);
		System.out.println("Min number in Maxcol is "+mincol);
	}
}
