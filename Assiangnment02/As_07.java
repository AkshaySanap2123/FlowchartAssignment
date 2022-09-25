/*
*/
import java.util.Scanner;

public class As_07
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no: ");
		int n=sc.nextInt();
		System.out.println();
		int mid=(n+1)/2;//5/2+1=2+1=3
		
		//upper
		for(int i=1;i<=mid;i++)
		{
			//space
			for(int s=1;s<=(mid-i);s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//lower
		for(int i=1;i<=(mid-1);i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*(mid-i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
			
