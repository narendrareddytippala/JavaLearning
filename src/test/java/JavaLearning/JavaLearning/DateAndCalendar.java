package JavaLearning.JavaLearning;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(d));
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));	
	}
}
