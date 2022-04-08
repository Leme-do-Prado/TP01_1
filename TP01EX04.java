import java.util.Scanner;

public class TP01EX04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
			
	double area;
	
	double height = read.nextDouble();
		
	double lengthbase = read.nextDouble();

	area = (height * lengthbase) / 2;
	
	System.out.println(area);
}
}
