package Third.JavaLearning.JavaLearning;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum=sumOfArray(a);
		System.out.println(sum);
		
		int mul = multiply(5,10);
		System.out.println(mul);

	}
      private static int multiply(int i, int j) {
		int mul=0;
		int k=1;
//		for(int k=1;k<=j;k++){
//			mul = mul+i;
//		}
		while(k<=j){
			mul = mul+i;
			k++;
		}
		return mul;
	}
	public static int sumOfArray(int a[]){
    	  int sum =0;
    	  for(int i : a){
    		  sum = sum+i;
    	  }
    	 return sum ;
      }
}
