package JavaLearning.JavaLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class GetRepeatNumbers {
	public static void main(String[] args) {
		
		int num[] = {4,5,5,5,4,6,7,6,11,7,8,8,9,9,12};
//		ArrayList<Integer> ab = new ArrayList<Integer>();
//		for(int i=0;i<num.length;i++)
//		{
//		int k =0;
//			if(!ab.contains(num[i])){
//				//System.out.println(ab);
//				ab.add(num[i]);
//				k++;
//				for(int j= i+1;j<num.length;j++)
//				{
//					if(num[i]==num[j]){
//						k++;
//					}
//				}
//				System.out.println(num[i] +"----"+k);			
//				if(k==1){
//					System.out.println("Unique number is: "+num[i]);
//				}
//			}	
//		}
		
		LinkedHashMap<Integer, Integer> hp = new LinkedHashMap<Integer, Integer>();
		for(int i:num){
		hp.put(i, hp.containsKey(i)?hp.get(i)+1:1);
		}
		for (Entry<Integer, Integer> en: hp.entrySet()){
			System.out.println(en.getKey()+"--"+en.getValue());
		}
	}
}
