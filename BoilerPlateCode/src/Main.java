import java.util.Scanner;

public class Main {
	

		public static void checkDiscount(double purchaseAmount)

		{ // your code here
         if(purchaseAmount>100)
         {
        	 System.out.println("Discount applicable");
         }
         else
         {
        	 System.out.println("Discount not applicable");
         }
		}

		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
         System.out.println("enter purchase amout");
         double purchaseAmount=scan.nextDouble();
         checkDiscount(purchaseAmount);
		}

	
}
