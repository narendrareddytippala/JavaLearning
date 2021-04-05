package Third.JavaLearning.JavaLearning;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Repeating_element_inArray {

	public static void main(String[] args) {
		int a[] = { 4, 2, 3, 5, 1, 2, 4 };
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i: a)
		mp.put(i, mp.containsKey(i)?mp.get(i)+1:1);
		for(Entry<Integer, Integer> en: mp.entrySet()){
			if(en.getValue()>1){
			System.out.println(en.getKey()+"--"+en.getValue());}
		}
	}

}
