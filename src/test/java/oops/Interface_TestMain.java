package oops;

public class Interface_TestMain {

	public static void main(String[] args) {
		Interface_HDFC hdfc = new Interface_HDFC();
		hdfc.accnum();
		hdfc.savingacc();
		hdfc.currentacc();
		hdfc.interset();
		hdfc.childloan();
		System.out.println(Interface_HDFC.i);
		System.out.println("***********");
		
		Interface_USBank ushdfc = new Interface_HDFC();
		ushdfc.accnum();
		ushdfc.savingacc();
		ushdfc.currentacc();
		ushdfc.childloan();
		System.out.println(Interface_USBank.i);
		System.out.println("***********");
		
		
		Interface_IndiaBank indbnk = new Interface_HDFC();
		Interface_IndiaBank.withdody();
		
//		String a = "apple";
//	    a.concat("Banana");
//		System.out.println(a);
		
//		StringBuffer sbf = new StringBuffer("apple");
//		sbf.append("banana");
//		System.out.println(sbf);
		
		
	}
}
