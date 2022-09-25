/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/

import java.util.Scanner;

public class As16
{
	public static void main(String[] args)
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=o.nextInt();
		System.out.println();
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}