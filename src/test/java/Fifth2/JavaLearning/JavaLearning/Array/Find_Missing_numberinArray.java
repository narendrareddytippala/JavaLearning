package Fifth2.JavaLearning.JavaLearning.Array;

public class Find_Missing_numberinArray {

	public static void main(String[] args) {
		int num[]={1,2,3,4,6};
		int len = num.length+1;
		int act = len*(len+1)/2;
		int exp=0;
		for(int i:num){
			exp=exp+i;
		}

		System.out.println(act-exp);
		
		
		int num1[]={1,2,3,4,6};
		int len1 = num.length+1;
		int act1=0, exp1=0;
		for(int j:num1){
			exp1=exp1+j;
		}
		
		for(int k=1;k<=len1;k++){
			act1=act1+k;
		}
		
		System.out.println(act1-exp1);
	}
}
