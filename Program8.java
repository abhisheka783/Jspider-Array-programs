//Reverse an array
import java.util.Scanner;
class Program8 
{
	public static void main(String[] args) 
	{
		int[] a=readarray();
		printarray(a);
		System.out.println(" ");
		reversearray(a);
		for(int i:a)
		{
			System.out.print(i+" ");
		}
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
	public static void reversearray(int[] a)
	{
		System.out.println("Reversed Array elements are!");
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
	}
}