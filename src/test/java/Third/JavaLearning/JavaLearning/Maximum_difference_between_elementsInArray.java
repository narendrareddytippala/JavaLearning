package Third.JavaLearning.JavaLearning;

public class Maximum_difference_between_elementsInArray {

	public static void main(String[] args) {
		int a[]={10,20,2,90,40};
		int max =a[0]; int min =a[0];
		for(int i:a){
			if(max<i){max=i;}
		}
		for(int j:a){
			if(min>j){min=j;}
		}
		System.out.println("Max diff is "+ (max-min));
	}
}
