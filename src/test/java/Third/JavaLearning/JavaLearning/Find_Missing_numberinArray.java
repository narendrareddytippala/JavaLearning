package Third.JavaLearning.JavaLearning;

public class Find_Missing_numberinArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6};
		int len = a.length+1;
		int act =0; int exp = 0;
		exp = len*(len+1)/2;
		for(int b:a){
			act=act+b;
		}
System.out.println("Missing num be "+(exp-act));
	}

}
