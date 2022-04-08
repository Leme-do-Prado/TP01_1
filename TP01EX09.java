import java.util.Scanner;

public class TP01EX09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double resist = read.nextDouble();
		double current = read.nextDouble();
		double tension = current * resist;
		
		System.out.println(tension);
	}
}
