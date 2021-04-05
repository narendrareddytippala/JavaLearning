package Fourth.JavaLearning.JavaLearning.Strings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateDifference {

	public static void main(String[] args) {
		LocalDate dat = LocalDate.now();
		System.out.println(dat);
		System.out.println(dat.plusDays(1));
		Date ss = new Date();
		Calendar cal = Calendar.getInstance() ;
		System.out.println(cal.getTimeZone());
		
//		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		LocalDate dd = LocalDate.now();
//		System.out.println(df.format(dd));
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
	}

}
