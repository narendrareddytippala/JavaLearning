package Fifth2.JavaLearning.JavaLearning.Array;

public class Maximum_difference_between_elementsInArray {

	public static void main(String[] args) {
		int a[]={10,20,2,90,40};
		int maxdiff=0, min=a[0],max=a[0];
		for(int i:a){
			if(i>max)
				max=i;
			if(i<min)
				min=i;
		}
		System.out.println("Max difference is "+(max-min));
		
		int b[]={10,20,2,90,40};
		int maxdiffb=0;
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[j]-b[i]>maxdiffb)
					maxdiffb=b[j]-b[i];
			}
		}
		System.out.println("Max difference is "+maxdiffb);
		
	}
}
