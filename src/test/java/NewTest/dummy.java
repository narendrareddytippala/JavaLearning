package NewTest;

public class dummy {
//	int a = 10;
//	void abc(){
//		int b =20;
//		System.out.println(b);
//		a=20;
//		System.out.println(a);
//	}
//	static int c= 30;
	public static void main(String[] args) {
//		System.out.println(c);
//		dummy d = new dummy();
//		System.out.println(d.a);
//		d.abc();
//		System.out.println(d.a);
		
		String aa= "hello";
		String bb = "hello";
		String cc = new String("beta");
		String dd = new String("beta");
		System.out.println(aa==bb);
		System.out.println(cc==dd);
		System.out.println(cc.equals(dd));
		dummy();
		dummy(2);
	}
	
	public static  void dummy(){
		System.out.println("aaaa");
	}
	public static  void dummy(int i){
		System.out.println(3);
	}
}
