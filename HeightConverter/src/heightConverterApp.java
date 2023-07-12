import java.util.Scanner;

public class heightConverterApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double inches=scan.nextDouble();
	HeightConverter HeightConverterApp = new HeightConverter();
	System.out.printf("%.2f",HeightConverterApp.convertInchesToFeet(inches));
}
}
