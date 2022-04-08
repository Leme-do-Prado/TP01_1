import java.util.Scanner;

public class TP01EX02 {
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
			
	double edge = read.nextDouble();
	double area;
	
	area = edge * edge;
	
	System.out.println(area);
}
}