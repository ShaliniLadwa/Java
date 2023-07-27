import java.util.Scanner;

public class Main {
public static void calculateSumOfDigit(int n)
{
	int sum=0;
	while(n!=0)
	{
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	System.out.println("Sum of digit "+sum);
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter num");
	int n=scan.nextInt();
	calculateSumOfDigit(n);
	
}
}
