//Sum and average of an Integer array
import java.util.Scanner;
class Program6 
{
	public static void main(String[] args) 
	{
		int[] a=readarray();
		sumavg(a);
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
	public static void sumavg(int[] a)
	{
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		System.out.println("Sum= "+sum+ " & average= "+(sum/a.length));

	}
}
