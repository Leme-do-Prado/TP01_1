import java.util.Scanner;

public class TP01EX16 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
			Scanner read = new Scanner(System.in);

			double a = read.nextDouble();
			
			a = Math.toRadians(a);
													
			double sin = Math.sin(a);
			
			double cos = Math.cos(a);
			
			double tan = Math.tan(a); 
			
			double sec = 1 / cos; 
			
			System.out.println(sin);
			System.out.println(cos);
			System.out.println(tan);
			System.out.println(sec);

		}
}
