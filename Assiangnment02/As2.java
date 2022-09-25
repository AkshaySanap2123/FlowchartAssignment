/*
A
A B
A B C
A B C D
A B C D E
*/

import java.util.Scanner;

public class As2
{
	public static void main(String[] args)
	{
		
		Scanner o=new Scanner(System.in);
		System.out.println("Enter no: ");
		//char ch=o.next().charAt(0);
		int n=o.nextInt();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}