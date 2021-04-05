package JavaLearning.JavaLearning;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int num[]={9,6,1,7,3,2,8,1};
		for (int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]>num[j]){
					int temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
//		for (int k=0;k<num.length;k++){
//		System.out.println(num[k]);
//		}
	}
}
