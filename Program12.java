//smallest of all prime numbers in an array
import java.util.Scanner;
class Program12
{
	public static void main(String[] args) 
	{
		int[] a=readarray();
		small(a);
		
	}
	public static int[] readarray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		int[] a=new int[length];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static boolean checkprime(int num)
	{
		if(num==1)
			return false;
		else
		{
			for (int i=2;i<num;i++)
			{
				if(num%i==0)
					return false;
			}
		}
		return true;
	}
	public static void small(int[] a)
	{
		boolean flag=false;
		int smallest=a[0];
		for (int i=0;i<a.length;i++)
		{
			boolean isprime=checkprime(a[i]);
			if(isprime)
			{
				if(a[i]<smallest)
				{
					smallest=a[i];
					flag=true;
				}
			}
		}
		if(flag)
		{
			System.out.println("Smallest of prime numbers is "+smallest);
		}
	}
}
