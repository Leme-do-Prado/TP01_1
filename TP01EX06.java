import java.util.Scanner;

public class TP01EX06 {
	@SuppressWarnings("resource")
		public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		double n1 = read.nextDouble();
		double n2 = read.nextDouble();
		double n3 = read.nextDouble();
		double n4 = read.nextDouble();
		double mean;
		
		mean = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println(mean);
		
		
	}
	
}
