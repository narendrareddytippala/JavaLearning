package Fifth.JavaLearning.JavaLearning.Strings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDifference {

	public static void main(String[] args) {
	LocalDateTime ldt = LocalDateTime.now();
	System.out.println(ldt);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
	System.out.println(ldt.format(dtf));
System.out.println(dtf.format(ldt));
	}

}
