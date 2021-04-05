package Second.JavaLearning.JavaLearning;

public class Next_greater_element_InArray {

	public static void main(String[] args) {
		int a[]={11,21,13,14};
		for(int i=0;i<a.length;i++){
			int next = -1;
			for(int j = i+1;j<a.length;j++){
				if(a[i]<a[j]){
					next = a[j];
					break;
				}
			}
			System.out.println(a[i]+"-- "+next);
		}
	}
}
