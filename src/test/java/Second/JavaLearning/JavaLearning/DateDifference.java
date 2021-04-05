package Second.JavaLearning.JavaLearning;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateDifference {

	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.of(2020, 12, 2, 10, 20);
		LocalDateTime d2 = LocalDateTime.of(2019, 5, 16, 5, 10);
		Duration dd = Duration.between(d2, d1);
		System.out.println(dd.getSeconds());
		
		LocalDate d3 = LocalDate.of(2020, 12, 2);
		LocalDate d4 = LocalDate.of(2019, 5, 16);
		Period p1 = Period.between(d4, d3);
		System.out.println(p1.getYears());
		System.out.println(p1.getMonths());
		System.out.println(p1.getDays());
	}

}
