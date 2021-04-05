package Second.JavaLearning.JavaLearning;

public class Find_Missing_numberinArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6};
		int len= a.length+1;
		System.out.println(len);
		int actcount;
		int expcount = 0;
		actcount = (len*(len+1)/2);
		for (int i : a) {
			expcount=expcount+i;
		}
		System.out.println(actcount-expcount);
	}
}
