package Third.JavaLearning.JavaLearning;

import java.time.LocalDate;
import java.time.Period;

public class DateDifference {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.of(2020, 5, 16);
		LocalDate ld2 = LocalDate.of(2000, 5, 16);
		Period dd = Period.between(ld2, ld1);
		System.out.println(dd.getYears());
	}
}
