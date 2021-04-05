package Fifth2.JavaLearning.JavaLearning.Array;

public class MaxNumInMatrixArray {

	public static void main(String[] args) {
		int[][] a = { { 3, 4, 5 }, 
					{ 4, 4, 2 }, 
					{ 11, 8, 7 } };
		int maxnum = a[0][0], minnum=a[0][0];
		int minnummaxcol=0,maxnummincol=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]> maxnum){
					maxnum=a[i][j];
					minnummaxcol=maxnum;
					for(int k=0;k<a.length;k++){
						if(a[k][j]<minnummaxcol){
							minnummaxcol=a[k][j];
						}
					}
					
				}
				if(a[i][j]< minnum){
					minnum=a[i][j];
					maxnummincol=minnum;
					for(int k=0;k<a.length;k++){
						if(a[k][j]>maxnummincol){
							maxnummincol=a[k][j];
						}
					}
				}
			}
		}
		System.out.println("Maximum number is "+maxnum);
		System.out.println("Minimun number in Maximum number is colum is  "+minnummaxcol);
		System.out.println("Minimun number is "+minnum);
		System.out.println("Maximum number in Minimun number is colum is  "+maxnummincol);
	}	
}
