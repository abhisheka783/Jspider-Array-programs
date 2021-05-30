//WAP to print all the missing numbers in a given array of sorted numbers
class Program41
{
	public static void main(String[] args) 
	{
		int[] a={3,5,7,10,15};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		pair(a);
	}
	public static void pair(int[] a)
	{
		int n;
		for(int i=0;i<a.length-1;i++)
		{
			n=a[i+1]-a[i];
			if(n>1)
			{
				for(int j=0;j<n-1;j++)
					System.out.print(++a[i]+" ");
			}
		}
	}
}