package Second.JavaLearning.JavaLearning;

public class EvenOddInArrary {

	public static void main(String[] args) {
		int a[]={3,9,5,6,7,8};
		int even=0; int odd=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				even++;
			}else
			{
				odd++;
			}
		}
System.out.println("Even "+even+" Odd "+odd);
	}

}
