package usefulClasses;

import java.util.Random;

public class SeedChangeRandom {
	public static void main(String[] args)
	{
		Random rand1 = new Random(-12);
		
		Random rand2 = new Random();
		// --> rand.setSeed(System.currentTimeMillis());
		
		for(int i=0; i<5; i++)
			System.out.println(rand1.nextInt(100));
		System.out.println("-----");
		for(int i=0; i<5; i++)
			System.out.println(rand2.nextInt(100));
	}
}
