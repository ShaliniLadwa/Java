import java.util.Scanner;

public class ExplorerApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the radius");
	double radius=scan.nextDouble();
	
	PlanetExplorer ExplorerApp = new PlanetExplorer();

	System.out.printf("%.2f",ExplorerApp.calculateSurfaceArea(radius));
}
}
