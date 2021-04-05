package oops;

public class Interface_HDFC implements Interface_USBank{
	
	@Override
	public void accnum() {
		System.out.println("HDFC --- accnum");
	}

	@Override
	public void savingacc() {
		System.out.println("HDFC --- savingacc");
		
	}

	@Override
	public void currentacc() {
		System.out.println("HDFC --- currentacc");	
	}
	
	public void interset() {
		System.out.println("HDFC --- interset");	
	}

	@Override
	public void childloan() {
		System.out.println("HDFC --- childloan");	
		
	}

	@Override
	public void parentloan() {
		System.out.println("HDFC --- parentloan");	
		
	}

	@Override
	public void testextends() {
		System.out.println("HDFC --- testextends");	
		
	}
}
