package com.level5;

public class Pat3 {
public static void main(String[] args) {
	for(int i=1;i<=3;i++)
	{

		for(int j=i;j<i-1;j++)
		{
			System.out.println("");
		}
		
		for(int k=1;k<=5;k++)
		{
			if( i==3 || k==2 ||k==4 )
			{
				System.out.print("*");
		    }
			else
			{
				System.out.print(" ");
			}
		
	}
		System.out.println("");

	}
}

}

