import java.util.Scanner;
public class DivBy5 {
	

		
		
						public static void main(String[] args) {
							Scanner scan = new Scanner(System.in);
							System.out.println("Enter the num div  by 5");
							int n = scan.nextInt();
							
							displayEven(n);
						}
			public static void displayEven(int n)
			{
				for(int i=0;i<=n;i++)
				{
					if(i%5==0)
					System.out.println(i);
				}
					
		}

	}


