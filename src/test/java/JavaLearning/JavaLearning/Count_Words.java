package JavaLearning.JavaLearning;

import java.util.Scanner;

public class Count_Words {

	public static void main(String[] args) {
		String name = "Hello java world";
		String[] a1 = name.split(" ");
		System.out.println(a1.length);
		int count =0;
		for (String a : name.split(" "))
		{
			System.out.println(a);
			count++;
		}
		
//		for(int i=0;i<name.length()-1;i++)
//		{	
//			if((name.charAt(i)== ' ') && (name.charAt(i+1)!= ' ')){
//				count++;
//			}
//		}
		System.out.println(count);

	}

}
