package oops;

import java.util.Objects;

public class Exception_Handling {
	public static void main(String[] args) throws Exception {
		
//		try{
//		int i = 10/0;
//		}catch(Throwable e){
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		finally{
//			System.out.println("Must run");
//		}
		
		System.out.println("Line 1");
		throw new Exception("My error");
	}
}
