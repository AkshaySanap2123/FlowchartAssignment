/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

import java.util.Scanner;

public class As14
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no: ");
		int n=s.nextInt();
		System.out.println();
		
		for(int i=n;i>=1;i--)//row...5,4,3,2,1
		{
			for(int j=1;j<=i;j++)//col...1,2,3,4,5
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
