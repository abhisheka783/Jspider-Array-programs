//Print all the perfect number of an array
import java.util.Scanner;
class Program10 
{
	public static void main(String[] args) 
	{
		int[] a=readarray();
		printperfect(a);
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
	public static void printperfect(int[] a)
	{
		System.out.println("ALL perfect numbers are!!");
		for(int i:a)
		{
			if(isperfect(i))
				System.out.println(i);
		}
	}
	public static boolean isperfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum==num?true:false;
	}
}
