/*
A B C D E
A B C D
A B C
A B
A
*/

import java.util.Scanner;

public class As18
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no: ");
		int n=s.nextInt();
		System.out.println();
		
		//char x='A';
		for(int i=1;i<=n;i++)
		{
			char x='A';
			for(int j=n;j>=i;j--)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
}