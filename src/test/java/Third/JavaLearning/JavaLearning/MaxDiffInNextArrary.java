package Third.JavaLearning.JavaLearning;

public class MaxDiffInNextArrary {

	public static void main(String[] args) {
		int a [] = {1,4,8,15,17};
		int diff = 0;
		int maxdiff=0;
//		for(int i =0; i< a.length;i++){
//			for(int j = i+1;j<a.length;j++){
//				diff = a[j]-a[i];
//				if(diff>maxdiff){
//					maxdiff = diff;
//					break;
//				}
//			}
//		}
		
		for(int i =0;i<a.length-1;i++){
			if(a[i+1]-a[i]>maxdiff){
				maxdiff = a[i+1]-a[i];
			}
		}	
		System.out.println(maxdiff);
	}
}
