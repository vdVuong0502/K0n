import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pale pObj = new Pale();
		System.out.println("Enter name here: ");
		String temp = sc.nextLine();
		pObj.setName(temp);
		pObj.saying();
	}
}
