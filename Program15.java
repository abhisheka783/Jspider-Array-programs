//Reverse an String array
import java.util.Scanner;
class Program15
{
	public static void main(String[] args) 
	{
		String[] a=readarray();
		printarray(a);
		System.out.println(" ");
		reversearray(a);
		for(String i:a)
		{
			System.out.print(i+" ");
		}
	}
	public static String[] readarray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		String[] a=new String[length];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		return a;
	}
	public static void printarray(String[] a)
	{
		System.out.println("Array elements are!");
		for(String i:a)
		{
			System.out.print(i+" ");
		}
	}
	public static void reversearray(String[] a)
	{
		System.out.println("Reversed Array elements are!");
		for(int i=0;i<a.length/2;i++)
		{
			String temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
	}
}