import java.util.Scanner;

/* TRABALHO PRÁTICO 01 
Leandro Lorenzon Leme do Prado Ribeiro */

public class TP01EX01 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
			
	double area;
	
	double height = read.nextDouble();
		
	double lengthbase = read.nextDouble();

	area = height * lengthbase;
	
	System.out.println(area);
}
}
