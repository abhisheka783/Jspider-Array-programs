//print commen elements of two integer array
class Program31
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5,6,7,8,9,10};
		for(int i : a)
			System.out.print(i+" ");
		System.out.println();
		int[] b={2,4,8,7,8,10};
		for(int i : b)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("common element of the above given array");
		occurence(a,b);
	}
	public static void occurence(int[] a,int[] b)
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(a[i] != -1)
			{
				for(int j=0;j<b.length;j++)
				{	
					if(b[j]!= -1)
					{
						if(a[i]==b[j])
						{
							count++;
							b[j]= -1;
						}
					}
				}
				if(count!=1)
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
