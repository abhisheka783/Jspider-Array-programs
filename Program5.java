//Reading and printing an String array
import java.util.Scanner;
class Program5
{
	public static void main(String[] args) 
	{
		String[] c=readarray();
		printarray(c);
	}
	public static String[] readarray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		String[] c=new String[length];
		System.out.println("Enter the array elements");
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.next();
		}
		return c;
	}
	public static void printarray(String[] c)
	{
		System.out.println("Array elements are!");
		for(String i:c)
		{
			System.out.println(i);
		}
	}
}
