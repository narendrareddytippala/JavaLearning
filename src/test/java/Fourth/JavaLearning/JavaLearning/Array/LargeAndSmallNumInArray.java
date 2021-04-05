package Fourth.JavaLearning.JavaLearning.Array;

public class LargeAndSmallNumInArray {

	public static void main(String[] args) {
		int  a[] = {25, 11, 7, 75, 56};
		int min=a[0],max =a[0];
		for(int i = 0;i<a.length;i++){
			if(a[i]<=min){
				min=a[i];
			}
			if(a[i]>=max){
				max=a[i];
			}
		}
		System.out.println("Min is "+min);
		System.out.println("Max is "+max);
	}

}
