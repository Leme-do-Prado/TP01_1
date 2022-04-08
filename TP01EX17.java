import java.util.Scanner;

public class TP01EX17 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
			Scanner read = new Scanner(System.in);

			double base = read.nextDouble();
													
			double power = read.nextDouble();

			double result = Math.pow(base, power);
			
			System.out.println(result);
		}
}
