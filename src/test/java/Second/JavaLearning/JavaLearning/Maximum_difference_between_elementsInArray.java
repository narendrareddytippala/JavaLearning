package Second.JavaLearning.JavaLearning;

public class Maximum_difference_between_elementsInArray {

	public static void main(String[] args) {
		int a[]={10,20,2,90,40};
		int max=a[0];	int min=a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(max<a[j]){
					max=a[j];
				}
				if(min>a[j]){
					min=a[j];
				}
			}	
		}
		System.out.println(max+"--"+min);
		System.out.println("Max diff is "+ (max-min));
	}

}
