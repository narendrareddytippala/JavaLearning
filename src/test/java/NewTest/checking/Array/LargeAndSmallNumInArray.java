package NewTest.checking.Array;

public class LargeAndSmallNumInArray {

	public static void main(String[] args) {
		int  a[] = {25, 11, 7, 75, 56};
		int max= a[0], min = a[0];
		for(int i:a){
			if(i>=max){
				max=i;
			}
			if(i<=min){
				min=i;
			}
		}
		System.out.println("Max is :"+max);
		System.out.println("Min is :"+min);
	}
}
