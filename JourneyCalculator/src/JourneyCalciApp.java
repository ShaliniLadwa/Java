import java.util.*;
public class JourneyCalciApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter speed and time");
	double speed=scan.nextDouble();
	double time=scan.nextDouble();
	
	JourneyCalci journeyCalci=new JourneyCalci();

	System.out.printf("%.2f",journeyCalci.calculateDistance(speed,time));
	
	
}
}
