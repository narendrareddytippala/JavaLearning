package oops;

public class Singleton {
		
	private static Singleton st=null;
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		if(st==null){
			st=new Singleton();
			
			// Converstions
//			int a = 10;
//			Integer b= new Integer(5);
//			Integer c= a;
//			
//			Integer z = new Integer(3);
//			int s = z.valueOf(z);
//			
//			
//			String  ff = "5";
//			int ii= Integer.parseInt(ff);
//			
//			int yy = 9;
//			String rt = String.valueOf(yy);
			
			int aa[] = new int[5];
			aa[0]=11;
			aa[2]=22;
			
			int bb[] = aa.clone();
			
			
		}
		return st;
	}
}
