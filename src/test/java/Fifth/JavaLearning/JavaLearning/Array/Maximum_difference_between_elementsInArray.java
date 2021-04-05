package Fifth.JavaLearning.JavaLearning.Array;

public class Maximum_difference_between_elementsInArray {

	public static void main(String[] args) {
		int a[]={10,20,2,90,40};
		int maxdiff =0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]-a[i]>maxdiff){
					maxdiff=a[j]-a[i];
				}
			}
		}
		System.out.println("Max difference is "+maxdiff);
	}

}
