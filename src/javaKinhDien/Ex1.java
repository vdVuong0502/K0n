package javaKinhDien;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
//		day so fibonacci
/*		
		System.out.print("Nhap gioi han day so fibonacci: ");
		int n = scan.nextInt();
		
		System.out.printf("%d so Fibonacci:\n", n);
		for (int i = 1; i <= n; i++) {
			System.out.println(fibonacci2(i) + " ");
		}
	*/	
		
// 		kiem tra so nguyen to		
		
		/*
		
		System.out.print("Nhap so muon kiem tra: ");
		int n = scan.nextInt();
		
		if (primeNumber(n) < 0) {
			System.out.printf("%d khong phai la so nguyen to.", n);
			
		} else {
			System.out.printf("%d la so nguyen to.", n);
		}
		*/
		
// tinh giai thua
		
/*		
		System.out.print("Nhap so muon tinh giai thua: ");
		int  n = scan.nextInt();
		if (n < 0) {
			System.out.printf("%d khong duoc la so am\n", n);
			
		} else {
			System.out.printf("%d! = %d", n, factorial2(n));
			
		}
		
	
*/
		
// bubble sort		
//		int[] arr = {18, 9, 33, 4, 84, 32};
//		bubbleSort(arr);
		
//selection sort
		/*
		int[] arr = {18, 9, 33, 4, 84, 32};
		selectionSort(arr);
		printArr(arr);
		*/
		
// insertion sort
		/*
		 
		int[] arr = {18, 9, 33, 4, 84, 32};
		insertionSort(arr);
		printArr(arr);
		*/
// chuyen doi he co so 10 sang he co so B, 2 <= B <= 16		
		/*
		System.out.print("Nhap vao so muon chuyen doi: ");
		int n = scan.nextInt();
		scan.nextLine();
		System.out.print("Nhap vao he co so muon chuyen doi: ");
		int d = scan.nextInt();
		
		System.out.println(convert10(n, d));
		*/

// chuyen doi he co so B sang he co so 10, 2 <= B <= 16
		
		System.out.print("Nhap vao he co so B: ");
		int d = scan.nextInt();
		System.out.print("Nhap vao so muon chuyen sang he thap phan: ");
		scan.nextLine();
		String n = scan.nextLine();
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
	
	static int primeNumber(int n) {
		if (n < 2) {
			return -1;
		}
		
		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				count++;
			}
			
			if (count > 1) return -1;
		}
		return 1;
		
	}
	
	static long factorial1(int n) {
		long f = 1;
		if (n == 0) return f;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		return f;
	}
	
	static long factorial2(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n*factorial2(n - 1);
		}
	}
	
	static void bubbleSort(int[] arr) {
		int temp = 0;
	
		for (int i = 0; i < arr.length - 1; i++) {
			for (int k = 0; k < arr.length - (i + 1); k++) {
				if (arr[k] > arr[k+1]) {
					
					temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
					
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void selectionSort(int[] arr) {
		int temp = 0;
		int tempIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			tempIndex = i;
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] < arr[tempIndex]) {
					tempIndex = k;
				}
			}
			
			temp = arr[tempIndex];
			arr[tempIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	/*
	 * if arr[i] < arr[k], increase the index of the rest by 1
	 * if arr[i] >= arr[k], insert into that position 
	 * */
	static void insertionSort(int[] arr) {
		int temp;
		int tempIndex;
		int count = 0; 
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			tempIndex = i;
			count = 0;
			for (int k = i - 1; k >= 0; k--) {
				if (temp < arr[k]) {
					arr[tempIndex] = arr[k];
					arr[k] = temp;
					tempIndex--;
				}
			}
			
		}
	}
	
	static String convert10(int n, int d) {
		String result = "";
		int remainder;
		while (n  > 0) {
			remainder = n % d;
			n = n / d;
			if (remainder <= 9) {
				result = (char) (remainder + 48) + result;
			} else {
				result = (char) (remainder + 55) + result;
			}
		}
		
		return result;
	}
	
}
