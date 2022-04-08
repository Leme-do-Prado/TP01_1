import java.util.Scanner;

public class TP01EX14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
			Scanner read = new Scanner(System.in);
			
			double r = read.nextDouble();
			
			double vole = (1.33 * Math.PI * Math.pow(r, 3)) / 2;
			
			System.out.println(vole);

			double a = read.nextDouble();
			
			double volc = a * a * a;
			
			System.out.println(volc);
			
			double volt = vole - volc;
			
			System.out.println(volt);
		}
}
