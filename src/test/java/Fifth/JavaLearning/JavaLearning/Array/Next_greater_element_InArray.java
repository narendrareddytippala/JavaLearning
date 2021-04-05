package Fifth.JavaLearning.JavaLearning.Array;

public class Next_greater_element_InArray {

	public static void main(String[] args) {
		int a[]={11,21,13,14};
		for(int i=0;i<a.length-1;i++){
			if(a[i]<a[i+1])
				System.out.println(a[i]+"--- "+a[i+1]);
			else
				System.out.println(a[i]+"--- "+"-1");
		}
		System.out.println(a[a.length-1]+"--- "+"-1");
	}
}
