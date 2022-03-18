public class apples {

	public static void main(String[] args) {
		System.out.println(average(437,435,234,224));
		
	};
	
	public static double average(double...numbers) {
		double total = 0;
		for (double x : numbers)
			total += x;
		
		return total / numbers.length;
		
	}
}
  