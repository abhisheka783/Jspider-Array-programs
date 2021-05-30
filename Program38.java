//First and second smallest # in an array without using Arrays.sort(a)
class Program38
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
		int firstsmall,secondsmall;
		firstsmall=secondsmall=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<firstsmall)
			{
				secondsmall=firstsmall;
				firstsmall=a[i];
			}
			else if(a[i]<secondsmall && a[i]!=firstsmall)
				secondsmall=a[i];
		}
		System.out.println(firstsmall+" is a smallest number and "+secondsmall+" is second smallest number");
	}
}
