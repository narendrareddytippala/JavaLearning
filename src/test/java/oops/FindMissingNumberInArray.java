package oops;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,5};
		int b = a.length+1;
		int sum =0;
		int act = 0;
		for(int i: a){
			sum=sum+i;
		}
		
		for(int j=1;j<=a.length+1;j++){
			 act = act+j;
		}
		
		
		//int act = b*(b+1)/2;
		System.out.println(act-sum);
	}
}
