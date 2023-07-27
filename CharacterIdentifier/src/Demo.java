import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a charater or vowel or digit ");
		char ch = scan.next().charAt(0);
	    identifierCharacter(ch);
	}
public static void identifierCharacter(char ch)
{
	if(Character.isDigit(ch))
	{
		System.out.println("Enter char "+ch+" is Digit");
	}
	else if(!Character.isLetter(ch))
	{
		System.out.println("Entered char "+ch+" is Special charater");
	}
	else
	{
		switch(Character.toLowerCase(ch))
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if(Character.isLowerCase(ch))
			{
				System.out.println("Entered char "+ch+" is lower case vowel" );
			}
			else
			{
				System.out.println("Entered char "+ch+" is upper case vowel");
			}
			break;
			default:
		
			if(Character.isUpperCase(ch))
			{
				System.out.println("Entered char "+ch+" is lower case consonant");
			}
			else
			{
				System.out.println("Entered char "+ch+" is upper case consonant");
			}
		
	}
}
}
}
