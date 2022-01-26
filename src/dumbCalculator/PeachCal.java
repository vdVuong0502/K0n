package dumbCalculator;
import java.util.Scanner;

public class PeachCal {
	public static void main(String[] args) {
		Scanner kSc = new Scanner(System.in);
		double num1, num2, answer;
		System.out.println("Enter first number:");
		
		num1 = kSc.nextDouble();
		
		System.out.println("Enter second number: ");
		num2 = kSc.nextDouble();
		
		answer = num1 + num2;
		
		System.out.println(answer);
		kSc.close();
	}
}
