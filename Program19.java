//copy of one array element into another array
class Program19 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		int[] b=copyarray(a);
		for(int i:b)
			System.out.print(i+" ");
	}
	public static int[] copyarray(int[] a)
	{
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		return b;
	}
}
