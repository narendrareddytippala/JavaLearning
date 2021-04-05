package JavaLearning.JavaLearning;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class StringDemo {

	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		System.out.println("Enter String");
		String name1 = scr1.nextLine();
		Scanner scr2 = new Scanner(System.in);
		System.out.println("Enter Char to filter");
		String name2 = scr2.next();
		int a = name1.length();
		int b = name1.replace(name2, "").length();
		System.out.println("Count is :"+name2+"-"+(a-b));
		
		
		String name = "narendra";
		ArrayList<Character> ar = new ArrayList<Character>();
		for(int i=0;i<name.length();i++){
			int k =0;
			if(!ar.contains(name.charAt(i))){
				ar.add(name.charAt(i));
				k++;
				for(int j=i+1;j<name.length();j++){
					if(name.charAt(i)==name.charAt(j)){
						k++;
					}
				}
				System.out.println("Count of "+name.charAt(i)+"---"+k);
			}
		}
		System.out.println("--------------------");
		String name3 = "narendra";
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (Character aa : name3.toCharArray()) {
			hm.put(aa, hm.containsKey(aa)?hm.get(aa)+1:1);
		}
		for (Entry<Character, Integer> en : hm.entrySet()) {
			System.out.println("Count of "+en.getKey()+"---"+en.getValue());
		}
		
	}

}
