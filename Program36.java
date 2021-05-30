//smallest # in an array without using Arrays.sort(a)
class Program36
{
	public static void main(String[] args) 
	{
		int[] a={10,32,30,52,41,10,9,5};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		int smallest=sorting(a);
		System.out.println(smallest+" is a smallest number");
	}
	public static int sorting(int[] a)
	{
		int smallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
				smallest=a[i];
		}
		return smallest;
	}
}
