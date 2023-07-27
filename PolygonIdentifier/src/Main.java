import java.util.Scanner;

public class Main {
public static void identifierPolygon(int sides)
{
	if(sides==3)
	{
		System.out.println("triangle");
	}
	else if(sides==4)
	{
		System.out.println("Quadrilateral");
	}
	else if(sides==5)
	{
		System.out.println("Pentagon");
		
	}
	else
	{
		System.out.println("polygon");
	}
	
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter sides of polygon");
	int sides = scan.nextInt();
	identifierPolygon(sides);
}
}
