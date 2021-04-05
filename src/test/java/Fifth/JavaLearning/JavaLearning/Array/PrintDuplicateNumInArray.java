package Fifth.JavaLearning.JavaLearning.Array;

import java.util.LinkedHashSet;

public class PrintDuplicateNumInArray {

	public static void main(String[] args) {
		int a[] ={1, 2, 3, 4, 2, 7, 8, 8, 3};
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		for(int i:a){
			if(lh.add(i)==false){
				System.out.println(i);
			}
		}

	}

}
