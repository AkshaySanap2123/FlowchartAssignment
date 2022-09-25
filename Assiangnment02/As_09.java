import java.util.Scanner;

public class As_09
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		System.out.println();
		int mid;
		
		//upper
		for(int i=1;i<=n;i++)
		{
			for(int s=i;s<n;s++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//lower
		for(int i=n;i>=1;i--)
		{
			for(int s=i;s<=n;s++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}