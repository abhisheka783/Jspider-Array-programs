//First and second largest # in an array without using Arrays.sort(a)
class Program39
{
	public static void main(String[] args) 
	{
		int[] a={10,32,30,52,41,10,9,5};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		sorting(a);
	}
	public static void sorting(int[] a)
	{
		int firstmax,secondmax;
		firstmax=secondmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>firstmax)
			{
				secondmax=firstmax;
				firstmax=a[i];
			}
			else if(a[i]>secondmax && a[i]!=firstmax)
				secondmax=a[i];
		}
		System.out.println(firstmax+" is a largest number and "+secondmax+" is second largest number");
	}
}
