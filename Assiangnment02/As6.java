/*
        *
	  * *
	* * * 
  * * * *
* * * * *
*/

import java.util.Scanner;

public class As6
{
	public static void main(String[] args)
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter no: ");
		int n=o.nextInt();
		System.out.println();
		
		for(int i=1;i<=n;i++)//row
		{
			for(int j=2*(n-i);j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//col
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


