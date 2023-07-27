import java.util.Scanner;

public class DivBy3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num");
		for (int i=1; i<100; i++) {
			if (i%3==0) 
			{
			System.out.println(i+ " div by 3 ");			
		}	
		else
		{
			
			System.out.println(i+ " not div by 3");
		}
	}
	}
}
