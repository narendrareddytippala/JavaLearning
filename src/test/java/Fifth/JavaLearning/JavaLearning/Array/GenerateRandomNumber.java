package Fifth.JavaLearning.JavaLearning.Array;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*(10000)));
		System.out.println(java.util.UUID.randomUUID());
		Random rnd = new Random();
		System.out.println(rnd.nextInt(9999));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
		System.out.println(dtf.format(ldt));
	}
}
