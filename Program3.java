//Reading and printing an Integer array
import java.util.Scanner;
class Program3 
{
	public static void main(String[] args) 
	{
		int[] a=readarray();
		printarray(a);
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
	public static void printarray(int[] a)
	{
		System.out.println("Array elements are!");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}
}
