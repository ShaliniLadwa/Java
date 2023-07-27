	import java.util.Scanner;
public class Odd {

	
		public static void main(String[] args) {
								Scanner scan = new Scanner(System.in);
								System.out.println("Enter the num div  by 3");
								int n = scan.nextInt();
								
								printOddDivBy5(n);
							}
				public static void printOddDivBy5(int n)
				{
					for(int i=1;i<=n;i++)
					{
						if(i%2!=0)
						{
							if(i%5==0)
							{
						
						System.out.println(i);
					}
						}
						
			}

				}
	}


