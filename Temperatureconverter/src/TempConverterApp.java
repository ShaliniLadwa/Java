import java.util.Scanner;

public class TempConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the faherihnit");
		double f=scan.nextDouble();
		TempConverter tempConverter = new TempConverter();

		System.out.printf("%.2f",tempConverter.convertFahrenheitToCelsius(f));
		
	}

}
