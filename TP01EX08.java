import java.util.Scanner;

public class TP01EX08 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double mm = read.nextDouble();
		double km = mm * 1.852;
		
		System.out.println(km);
	}
}
