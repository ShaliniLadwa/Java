import java.util.Scanner;

public class FactorialNum {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter factorial ");
	int N=scan.nextInt();
	long fact=1;
	for(int i=1;i<=5;i++) 
	{
		fact=fact*i;
	}
	System.out.println(" fact of "+N+" is " +fact);
	}

}
