import java.util.Scanner;

public class TP01EX18 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
			Scanner read = new Scanner(System.in);

			double p1  = read.nextDouble();
			double p2  = read.nextDouble();
			double p3  = read.nextDouble();
			double p4  = read.nextDouble();
			double p5  = read.nextDouble();
			double pagamento = read.nextDouble();
			
			double smtr = p1 + p2 + p3 + p4 + p5;
			double troco = pagamento - smtr;
			
			System.out.println(smtr);
			System.out.println(troco);
		}
}
