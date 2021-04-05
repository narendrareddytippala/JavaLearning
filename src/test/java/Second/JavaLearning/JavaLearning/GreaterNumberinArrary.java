package Second.JavaLearning.JavaLearning;

public class GreaterNumberinArrary {

	public static void main(String[] args) {
		int a[] = {5,8,2,9,6,1,12,16,15,14};
		int max=a[0];
		for(int i=0;i<a.length;i++){
				if(max<a[i]){
					max=a[i];
				}	
		}
			System.out.println(max);
	}

}
