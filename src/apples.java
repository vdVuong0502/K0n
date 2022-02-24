import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int count = 0;
		
		while (count < 10) {
			grade =  input.nextInt();
			total += grade;
			count++;
		}
		
		average = total / (count + 1);
		System.out.println("average is " + average);
		
	}
}
