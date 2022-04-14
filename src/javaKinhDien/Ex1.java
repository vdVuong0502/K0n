package javaKinhDien;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhap gioi han day so fibonacci: ");
		int n = scan.nextInt();
		
		System.out.printf("%d so Fibonacci:\n", n);
		for (int i = 1; i <= n; i++) {
			System.out.println(fibonacci2(i) + " ");
		}
	}
	
	static int fibonacci1(int n) {
		int[] fib = new int[n];
		int f1 = 0;
		int f2 = 1;
		int fn = 1;
		if (n <= 0) {
			return -1;
		} else if ( n <= 2) {
			return n - 1; 
		} else {
			for (int i = 3; i < n;  i++) {
				f1 = f2;
				f2 = fn;
				fn = f1 + f2;
			}

			return fn;
		}
	}
	
	static int fibonacci2(int n) {
		if (n <= 0) {
			return -1;
		} else if ( n <= 2) {
			return n - 1; 
		} else {
			return fibonacci2(n-1) + fibonacci2(n-2);
		}
	}
}
