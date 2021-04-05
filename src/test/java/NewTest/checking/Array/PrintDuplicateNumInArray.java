package NewTest.checking.Array;

import java.util.LinkedHashSet;

public class PrintDuplicateNumInArray {

	public static void main(String[] args) {
		int a[] ={1, 2, 3, 4, 2, 7, 8, 8, 3};
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		for(int b:a){
			if(!lh.add(b)){
				System.out.println(b);
			}
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}
			}
		}
		
	}
}
