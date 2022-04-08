import java.util.Scanner;

public class TP01EX05 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
			
	double volume, radius;
	
	double diameter = read.nextDouble();
		
	radius = diameter / 2;
	
	volume = (4 * Math.PI * (radius * radius * radius)) / 3;
	
	System.out.println(volume);
}
}
