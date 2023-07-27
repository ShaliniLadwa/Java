import java.util.Scanner;

public class Vending {
public static void getProduct(String productCode)
{
	switch(productCode)
	{
	case "P01":
		System.out.println("Coco Cola");
		break;
	case "P02":
		System.out.println("Pepsi");
		break;
	case "P03":
		System.out.println("Mirinda");
		break;
	case "P04":
		System.out.println("Dew");
		break;
		default:
			System.out.println("Enetr valid code");
	}
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter code to fetch ");
	String productCode= scan.next();
	getProduct(productCode);
}
}
