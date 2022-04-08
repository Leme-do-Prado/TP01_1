import java.util.Scanner;

public class TP01EX13 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
			Scanner read = new Scanner(System.in);

			double vi = read.nextDouble();
							
			double acc = read.nextDouble();
			
			double t = read.nextDouble();
			
			double vf = vi + acc * t;
			
			System.out.println(vf);
		}

}
