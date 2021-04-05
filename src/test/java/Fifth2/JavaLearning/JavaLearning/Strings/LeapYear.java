package Fifth2.JavaLearning.JavaLearning.Strings;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2012;
		if(year%4==0||year%400==0&year%100!=0){
			System.out.println("This is leap year");
		}

	}

}
