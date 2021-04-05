package oops;

public class Abstract_TestMain {

	public static void main(String[] args) {
		Abstract_HDFC hd = new Abstract_HDFC();
		hd.loan();
		hd.savingacc();
		hd.currentacc();
		
		hd.i=20;
		System.out.println(hd.i);

	}

}
