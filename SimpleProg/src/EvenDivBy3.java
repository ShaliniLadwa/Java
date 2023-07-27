import java.util.Scanner;
public class EvenDivBy3 {
	public static void main(String[] args) {
							Scanner scan = new Scanner(System.in);
							System.out.println("Enter the num div  by 3");
							int n = scan.nextInt();
							
							printDiv2And3(n);
						}
			public static void printDiv2And3(int n)
			{
				for(int i=1;i<=n;i++)
				{
					if(i%2==0)
					{
						if(i%3==0)
						{
					
					System.out.println(i);
				}
					}
					
		}

			}
}
