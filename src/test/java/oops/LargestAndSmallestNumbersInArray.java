package oops;

public class LargestAndSmallestNumbersInArray {

	public static void main(String[] args) {
		int[] num = {4,5,7,-33,8,9,12,2,16,15};
		int max=num[0];
		int min=num[0];
//		for(int i=0;i<num.length;i++){
//			for(int j=i+1;j<num.length;j++){
//				if(max<num[j]){
//					max = num[j];
//				}
//				if(min>num[j]){
//					min = num[j];
//				}
//			}
//		}
		for (int i : num) {
			if(i>max){
				max = i;
			}
			if(i<min){
				min = i;
			}
		}
		
		System.out.println("Max is :"+max);
		System.out.println("Min is :"+min);
	}
}
