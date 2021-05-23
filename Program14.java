//Reverse an character array
import java.util.Scanner;
class Program14 
{
	public static void main(String[] args) 
	{
		char[] a=readarray();
		printarray(a);
		System.out.println(" ");
		reversearray(a);
		for(char i:a)
		{
			System.out.print(i+" ");
		}
	}
	public static char[] readarray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		char[] a=new char[length];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		return a;
	}
	public static void printarray(char[] a)
	{
		System.out.println("Array elements are!");
		for(char i:a)
		{
			System.out.print(i+" ");
		}
	}
	public static void reversearray(char[] a)
	{
		System.out.println("Reversed Array elements are!");
		for(int i=0;i<a.length/2;i++)
		{
			char temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
	}
}