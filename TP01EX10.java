import java.util.Scanner;

public class TP01EX10 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double c = read.nextDouble();
		double f = c * 9 / 5 + 32;
		
		System.out.println(f);
	}
}
