package Second.JavaLearning.JavaLearning;

public class MaxMinNumberInArrary {

	public static void main(String[] args) {
		int num[]={3,5,1,7,2,6};
		int min=num[0];
		for(int i=0;i<num.length;i++){
			if(min>num[i]){
				min=num[i];
			}
		}
		System.out.println("Min is "+min);
	}

}
