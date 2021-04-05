package oops;

public class Thistest {
// 1st type  instance varibles
	public static String name = "a";
	public static String add = "b";
	
	public void this1(String name, String add){
		this.name = name;
		this.add = add;
	}
// 2nd type	invoke methods
	public void this2(){
		this.this1("aaa","bbb");
	}

// 3rd type	invoke construtor
	public Thistest(){
		System.out.println("This is 3rd type");
	}
	public Thistest(int i){
		this();
		System.out.println("This is 3rd type");
	}
	
// 4th type	use as argument
	void m1(Thistest td){
		
	}
	void m2(){
		m1(this);
	}
	
// 5th type return current class instance
	Thistest m3(){
		return this;
	}
	public static void main(String[] args) {

	}

}
