package Fourth.JavaLearning.JavaLearning.Array;

public class Maximum_difference_between_elementsInArray {

	public static void main(String[] args) {
		int a[]={10,20,2,90,40};
		int min=a[0], max=a[0];
		for(int i:a){
			if(i>max){
				max=i;
			}
			if(i<min){
				min=i;
			}
		}
		System.out.println("Max Diff is: "+(max-min));
	}

}
