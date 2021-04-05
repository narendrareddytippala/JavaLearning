package Fifth.JavaLearning.JavaLearning.Strings;

import java.util.Arrays;

public class ToStringtest {

	int empid;
	String name;
	String place;
	ToStringtest(int empid, String name, String place){
		this.empid=empid;
		this.name=name;
		this.place=place;
	}
	public static void main(String[] args) {
		ToStringtest aa = new ToStringtest(1, "Aplle", "CA");
		ToStringtest bb = new ToStringtest(2, "Bplle", "BC");
		System.out.println(aa);
		System.out.println(bb);
	}

}
