
import java.util.Scanner;

public class TempConvertorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temp in F");
		double f=scan.nextDouble();
		scan.close();
		TempConvertor temperatureConverter=new TempConvertor();
		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
	}

}