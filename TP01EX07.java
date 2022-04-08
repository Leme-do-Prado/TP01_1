import java.util.Scanner;

public class TP01EX07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

	Scanner read = new Scanner(System.in);
	
	double n1 = read.nextDouble();
	double n2 = read.nextDouble();
	
	double mean = Math.sqrt((n1 * n2));
	
	System.out.println(mean);
	}
}
