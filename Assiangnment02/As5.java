/*
A
B B
C C C
D D D D
E E E E 
*/

import java.util.Scanner;

public class As5
{
	public static void main(String[] args)
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter no: ");
		int n=o.nextInt();
		System.out.println();
		
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}