package Numerical_Problems;
import java.util.Scanner;

public class PerfectNo 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number to check if it is a perfect no or not");
		
		int n=s.nextInt();
		int sum=0;
		
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==n)
		{
			System.out.println(n+" is a perfect no");
		}
		else
			System.out.println(n+" is not a perfect no");
	}

}
