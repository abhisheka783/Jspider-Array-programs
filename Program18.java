//find a key element in a given String array.Display appropriate msg.
import java.util.Scanner;
class Program18 
{
	public static void main(String[] args) 
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
		System.out.println("Enter the key element");
		String key=sc.next();
		linearsearch(a,key);
	}
	public static void linearsearch(String[] a,String key)
	{
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(key.equals(a[i]))
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