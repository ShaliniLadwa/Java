import java.util.Scanner;

public class Age {
public static void categorizerAge(int age)
{
	if(age>=0 && age<=12)
	{
		System.out.println("entred age "+age+" is a child");
	}
	else if(age>=13 && age<=19)
	{
		System.out.println("entred age "+age+" is a teen");
	}
	else if(age>=20 && age<=59)
	{
		System.out.println("entred age "+age+" is a adult");
	}
	else
	{
		System.out.println("entred age "+age+" is a senior");
	}
}
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter age");
	int age=scan.nextInt();
	categorizerAge(age);
}
}
