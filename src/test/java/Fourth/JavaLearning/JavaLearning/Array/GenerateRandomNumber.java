package Fourth.JavaLearning.JavaLearning.Array;

import java.util.Random;
import java.util.UUID;

import javax.rmi.CORBA.Util;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println((int) (Math.random() * (1300 - 200 + 1) + 200));
		
		Random rn = new Random();
		System.out.println(rn.nextInt(999999));
		
		UUID rnd = java.util.UUID.randomUUID();
		System.out.println(rnd);
	}
}
