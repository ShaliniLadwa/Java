import java.util.Scanner;
public class Divby3 {
	
	
					public static void main(String[] args) {
						Scanner scan = new Scanner(System.in);
						System.out.println("Enter the num div  by 3");
						int n = scan.nextInt();
						displayEven(n);
					}
		public static void displayEven(int n)
		{
			for(int i=0;i<=n;i++)
			{
				if(i%3==0)
				System.out.println(i);
			}
				
	}

}
