//largest # in an array without using Arrays.sort(a)
class Program37
{
	public static void main(String[] args) 
	{
		int[] a={10,32,30,52,41,10,9,5};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		int largest=sorting(a);
		System.out.println(largest+" is a largest number");
	}
	public static int sorting(int[] a)
	{
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
				largest=a[i];
		}
		return largest;
	}
}
