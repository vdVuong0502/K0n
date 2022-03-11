public class apples {

	public static void main(String[] args) {
		int k0n[] = {3, 4, 5, 6, 7};
		
		change(k0n);
		for (int x : k0n) {
			System.out.println(x);
		}
	}
	
	public static void change(int  x[]) {
		for(int counter = 0; counter < x.length; counter++) {
			x[counter] += 5; 
		}
	};
}
  