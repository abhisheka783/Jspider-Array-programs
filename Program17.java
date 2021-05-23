//find a key element in a given character array.Display appropriate msg.
import java.util.Scanner;
class Program17 
{
	public static void main(String[] args) 
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
		System.out.println("Enter the key element");
		char key=sc.next().charAt(0);
		linearsearch(a,key);
	}
	public static void linearsearch(char[] a,char key)
	{
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("key is found at "+(i+1)+"th position");
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("key is not found");
	}
}