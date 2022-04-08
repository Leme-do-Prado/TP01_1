import java.util.Scanner;

public class TP01EX12 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
			Scanner read = new Scanner(System.in);

			double radius = read.nextDouble();
							
			double height = read.nextDouble();
			
			double volume = (Math.PI * radius * radius * height) / 3;
			
			System.out.println(volume);
		}

}
