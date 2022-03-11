package dumbCalculator;
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			System.out.println(rand.nextInt(6));
		}
		
	}
	
}
