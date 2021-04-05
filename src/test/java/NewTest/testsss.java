package NewTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class testsss {

	public static void main(String[] args) {
//		int age = 16;
//		if(age<18){
//			throw new ArithmeticException("hello");
//		}
//		Stack<String> st = new Stack<>();
//		st.push("aaaa");
//		st.push("bbbb");
//		st.push(null);
//		st.push("dddd");
//		st.push(null);
//		st.push("ccccccccc");
//		while(!st.isEmpty()){
//			System.out.println(st.pop());
//		}
//		Iterator<String> itr=st.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
		
//		TreeSet<String> set=new TreeSet<String>();  
//		set.add("Ravi");  
	//	set.add(null);  
//		set.add("Ravi");  
//		set.add("Ajay");  
	//	set.add(null);  
//		set.add("vvv"); 
//		set.add(" "); 
//		set.add("zzz"); 
//		set.add(" "); 
//		set.add("ASASAS"); 
//		Iterator<String> itr=set.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
		
//		HashMap<Integer, String> hm = new HashMap<>();
//		hm.put(1, "aaa");
//		hm.put(2, "aaa");
//		//hm.put(null, "ccc");
//		hm.put(3, null);
//		hm.put(4, null);
//		for(Entry<Integer, String> en: hm.entrySet()){
//			System.out.println(en.getKey()+en.getValue());
//		}
		
//		Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
//	     map.put(100,"Amit");    
//	     map.put(102,"Ravi");   
//	     map.put(101,"Vijay");    
//	     map.put(103,"Rahul");    
//	     System.out.println("Initial Map: "+map);  
//	     //Inserts, as the specified pair is unique  
//	     map.putIfAbsent(104,"Gaurav");  
//	     System.out.println("Updated Map: "+map);  
//	     //Returns the current value, as the specified pair already exist  
//	     map.putIfAbsent(101,"Vijaydddd");  
//	     System.out.println("Updated Map: "+map);  
		
		LinkedList<String> al = new LinkedList<>();
		al.add("dddd");
		al.add("aaaa");
		al.add("ffff");
		al.add("cccc");
		al.add("bbbb");
		//System.out.println(al.get(3));
		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());;
//		System.out.println(al);
		
		Iterator<String> it= al.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
//		Vector<String> aa = new Vector<>();
//		aa.addElement("vvv");
//		aa.addElement("bbb");
//		aa.addElement("ccc");
//		aa.addElement("aaa");
//		System.out.println(aa);
//		Iterator<String> it =aa.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//			
//		}
//		
//		Enumeration<String> en= aa.elements();
//		while(en.hasMoreElements()){
//			System.out.println(en.nextElement());
//			
//		}
		
	}
}
