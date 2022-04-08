import java.util.Scanner;

public class TP01EX11 {
	@SuppressWarnings("resource")
		public static void main(String[] args) {
		
				Scanner read = new Scanner(System.in);
	
				double area, radius;
				
				double diameter = read.nextDouble();
					
				radius = diameter / 2;
				
				area = Math.PI * radius * radius;
				
				System.out.println(area);
			}
}
