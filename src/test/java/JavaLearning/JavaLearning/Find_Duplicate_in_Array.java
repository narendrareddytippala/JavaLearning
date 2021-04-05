package JavaLearning.JavaLearning;

import java.util.HashSet;

public class Find_Duplicate_in_Array {

	public static void main(String[] args) {
		String a[]={"java","c+","JS","Net","java","Python"};
		
//		for(int i=0;i<a.length;i++){
//			for(int j=i+1;j<a.length;j++){
//				if(a[i]==a[j]){
//					System.out.println("Found Duplicate of "+a[i]);
//				}
//			}
//		}
		HashSet<String> hs = new HashSet<String>();
		for(String k:a){
			if(hs.add(k)==false){
				System.out.println("Found Duplicate "+ k);
				
			}
		}

	}

}
