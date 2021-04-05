package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.Arrays;

public class CompareTwoArrarys {

	public static void main(String[] args) {
		int a[] = {2,4,6,7,9};
		int b[] ={2,4,6,7,9};
		boolean status = true;
		if(Arrays.equals(a, b)){
			System.out.println("Same Arrays");
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]!=b[i]){
				status = false;
			}
		}
		if(!status){
			System.out.println("Not Same Arrays");
		}
		else {System.out.println("Same Arrays");}
	}
}
