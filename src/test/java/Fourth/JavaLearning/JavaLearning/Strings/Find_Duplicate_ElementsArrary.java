package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class Find_Duplicate_ElementsArrary {

	public static void main(String[] args) {
		String [] name ={"java","c++","python","java","net","cobol"};
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		for(String a : name){
			lh.put(a, lh.containsKey(a)?lh.get(a)+1:1);
		}
		lh.forEach((k,v)->{System.out.println(k+"--"+v);});
		System.out.println("-----------");
		HashSet<String> hs= new HashSet<>();
		for(String a : name){
			if(!hs.add(a)){
				System.out.println(a);
			}
		}
	}

}
