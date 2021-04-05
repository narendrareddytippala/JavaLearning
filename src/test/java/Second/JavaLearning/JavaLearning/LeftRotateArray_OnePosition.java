package Second.JavaLearning.JavaLearning;

public class LeftRotateArray_OnePosition {

	public static void main(String[] args) {
		int a[]={10,20,30,40,50};
		int temp = a[0];
		for(int i = 1; i<a.length;i++){
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		for(int j:a){
			System.out.println(j);
		}
	}

}
