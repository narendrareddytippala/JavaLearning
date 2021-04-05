package Fifth.JavaLearning.JavaLearning.Array;

public class Find_Missing_numberinArray {

	public static void main(String[] args) {
		int num[]={1,2,3,4,6};
		int len = num.length+1;
		int expcount = len*(len+1)/2;
		int actcount =0;
		for(int i:num){
			actcount=actcount+i;
		}
		System.out.println("Missing number is "+(expcount-actcount));
	}
}
