package Fourth.JavaLearning.JavaLearning.Array;

public class Find_Missing_numberinArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6};
		int actnum=0;
		int len = a.length+1;
		int b[] = new int[len];
		int expnum = len*(len+1)/2;
		for(int i:a){
			actnum=actnum+i;
		}
		System.out.println("Missing number is :"+(expnum-actnum));
	}
}
