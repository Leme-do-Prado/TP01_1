import java.util.Scanner;

public class TP01EX03 {
@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
			
	double diagonal = read.nextDouble();
	double area;
	
	area = (diagonal * diagonal)/2;
	
	System.out.println(area);
}
}
