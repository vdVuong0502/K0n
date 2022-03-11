import java.util.Random;

public class apples {

	public static void main(String[] args) {
		System.out.println(Math.min(8.6, 5.2));
		
		Random rand = new Random();
		int[] dices = new int[7];
		
		for (int roll = 1; roll < 1000; roll++) {
			++dices[1+rand.nextInt(6)];
		}
		
		System.out.println("Dice face \t Freq");
		
		for (int face = 1; face < dices.length; face++) {
			System.out.println(face + "\t\t\s" + dices[face]);
		}
	}
}
  