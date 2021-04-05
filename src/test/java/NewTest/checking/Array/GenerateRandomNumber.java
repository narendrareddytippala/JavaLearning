package NewTest.checking.Array;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		String rnd1 = java.util.UUID.randomUUID().toString();
		Random rnd2 = new Random();
		
		double rnd3=Math.random();
		int rnd4 = (int)(Math.random()*(500-200+1)+200);
		System.out.println(rnd1);
		System.out.println(rnd2.nextInt(9999));
		System.out.println(rnd3);
		System.out.println(rnd4);
	}

}
