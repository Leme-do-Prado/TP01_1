import java.util.Scanner;

public class TP01EX15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
			Scanner read = new Scanner(System.in);

			double dol = read.nextDouble();
							
			double cdolreal = read.nextDouble();
			
			double real = dol * cdolreal;
			
			System.out.println(real);
		}

}
