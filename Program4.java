//Reading and printing an Character array
import java.util.Scanner;
class Program4 
{
	public static void main(String[] args) 
	{
		char[] c=readarray();
		printarray(c);
	}
	public static char[] readarray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		char[] c=new char[length];
		System.out.println("Enter the array elements");
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.next().charAt(0);
		}
		return c;
	}
	public static void printarray(char[] c)
	{
		System.out.println("Array elements are!");
		System.out.println(c);
	}
}
