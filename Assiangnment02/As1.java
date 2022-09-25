/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
import java.util.Scanner;

public class As1
{
	public static void main(String[] args)
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter no: ");
		int n=o.nextInt();
		System.out.println();
		
		for(int i=1;i<=n;i++)//row
		{
			for(int j=1;j<=i;j++)//col
			{

				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}