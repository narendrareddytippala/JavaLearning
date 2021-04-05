
package NewTest;import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class aaa {
	int f =9;
	public aaa get(){
		
		return this;
	}
	public void vv(){
		
		System.out.println("Heeloo");
	}
}


public class rough extends aaa{
	
	static String f= "Brag";
	static String g= "Grab";
	
	
	
	static int a[] = {1,2,3,4,5,3};
	static int b[] = new int[a.length];
//	int data = 50;
//	void change(int data){  
//		 data=data+100;//changes will be in the local variable only  
//		 }  
	public static void main(String[] args) {
		String a1 = "Mother In Law";
		String b1 = "Hitler Woman";
		
		char[] a2 = a1.replace(" ", "").toLowerCase().toCharArray();
		char[] b2 = b1.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(a2);
		Arrays.sort(b2);
		boolean status =Arrays.equals(a2, b2);
		System.out.println(status);
		
		ArrayList<String> al = new ArrayList<>();
		al.add("r");
		al.add("a");
		al.add("s");
		al.add("b");
		al.add("c");
		
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		al.add("fff");
		System.out.println(al);
		
		
		
		List<String> hh= Collections.unmodifiableList(al);
		hh.add("aaa");
	      
		HashMap<Integer, Integer> df = new HashMap<>();
		df.put(1, 1);
		df.put(2, 2);
		df.put(3, 3);
		Collections.synchronizedMap(df);
//		rough rp = new rough();
//		System.out.println(rp.data);
//		rp.change(500);
//		System.out.println(rp.data);
//		    int  a =10;
//			count(a);
//			System.out.println(a);
//		aaa a = new aaa();
//		a.get().vv();
//	System.out.println(a.f);
		
//		for(int i = 0 ; i< a.length;i++){
//			b[i]=a[i];
//		}
//		System.out.println(Arrays.toString(b));
//		
//		HashSet<Integer> hs = new HashSet<>();
//		for(int s:a){
//			if(hs.add(s)==false){
//				System.out.println(s);
//			}
//		}
		
//		for(int i = 0;i<a.length;i++){
//			
//				b[i]=a[a.length-i-1];
//			
//		}
//		System.out.println(Arrays.toString(b));
		
	}
		public static void count(int a){
			 a= 20;
		}
		
}
