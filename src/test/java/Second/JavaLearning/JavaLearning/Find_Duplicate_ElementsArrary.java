package Second.JavaLearning.JavaLearning;

import java.util.ArrayList;
import java.util.HashSet;

public class Find_Duplicate_ElementsArrary {

	public static void main(String[] args) {
		String [] name ={"java","c++","python","java","net","cobol","net"};
//Method 01:		
//		ArrayList<String> ar= new ArrayList<String>();
//		for(int i=0;i<=name.length-1;i++){
//			int k=0;
//			if(!ar.contains(name[i])){
//				ar.add(name[i]);
//				k++;
//				for(int j=i+1;j<=name.length-1;j++){
//					if(name[i].equals(name[j])){
//						k++;
//					}
//				}
//				System.out.println(name[i]+"--"+k);
//			}
//		}
		
//Method 02:	
//		for(int i=0;i<=name.length;i++){
//			for(int j=i+1;j<name.length;j++){
//				if(name[i]==name[j]){
//					System.out.println("Found Duplicate of "+ name[i]);
//				}
//			}
//		}
		
//Method 03:	
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<name.length;i++){
			if(hs.add(name[i])==false){
				System.out.println("Found Duplicate of "+ name[i]);
			}
		}
	}

}
