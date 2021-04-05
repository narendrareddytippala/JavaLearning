package Fourth.JavaLearning.JavaLearning.Array;

public class MaxDiffInNextArrary {

	public static void main(String[] args) {
		int a [] = {1,4,2,8,57,1,22,122};
		int maxdiff=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]-a[i]>maxdiff){
					maxdiff=a[j]-a[i];
				}
				break;
			}
		}
		System.out.println(maxdiff);
		
		int maxdiff2=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i+1]-a[i]>maxdiff2){
				maxdiff2=a[i+1]-a[i];
			}
		}
		System.out.println(maxdiff2);
	}
}
