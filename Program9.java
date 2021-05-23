//find a key element in a given array.Display appropriate msg.
import java.util.Scanner;
class Program9 
{
	public static void main(String[] args) 
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
		System.out.println("Enter the key element");
		int key=sc.nextInt();
		linearsearch(a,key);
	}
	public static void linearsearch(int[] a,int key)
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