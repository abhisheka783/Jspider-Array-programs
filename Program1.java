//Basic initilization and printing
class Program1 
{
	public static void main(String[] args) 
	{
		int[] a=new int[5];
		System.out.println(a.length);
		System.out.println("Default values");
		System.out.println("_______________");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+10;
		}
		System.out.println("values after initilization");
		System.out.println("_______________");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
