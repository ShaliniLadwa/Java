import java.util.Scanner;

public class Check {
	
		public static void checkMultipleOfTen(int n,int m)
		{ 
			if(n % m == 0)
			{
				System.out.println("Entered Number "+n+" Is Multiple Of "+m);
		}
			else
			{
				System.out.println("Entered Number "+n+" Is Multiple Of "+m);
			}
		}
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter 2 num");
			int n=scan.nextInt();
			int m=scan.nextInt();
			checkMultipleOfTen(n,m); 
		 }
		
	}

