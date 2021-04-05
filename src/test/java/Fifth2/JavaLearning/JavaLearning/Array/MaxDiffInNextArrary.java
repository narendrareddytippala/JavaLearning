package Fifth2.JavaLearning.JavaLearning.Array;

public class MaxDiffInNextArrary {

	public static void main(String[] args) {
		int a [] = {1,4,2,8,57,1,22,122};
		int maxdiff =0;
		for(int i =0;i<a.length-1;i++){
			if(a[i+1]-a[i]>maxdiff){
				maxdiff=a[i+1]-a[i];
			}
		}
		System.out.println(maxdiff);
	}
}
