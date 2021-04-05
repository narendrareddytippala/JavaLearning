package Fifth2.JavaLearning.JavaLearning.Array;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		String a =java.util.UUID.randomUUID().toString();
		System.out.println(a);
		double b= Math.random();
		System.out.println(b);
		
		int c=(int)(Math.random()*(2000));
		System.out.println(c);
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(3000));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM-dd-yyyy HH:MM:SS");
		String tim= dtf.format(ldt);
		System.out.println(tim);
	}
}
