//print all unique element of a given input array
class Program27
{
	public static void main(String[] args) 
	{
		int[] a={2,5,7,6,5,5,2,7,2,1};
		for(int i : a)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("All unique element of the above given array");
		occurence(a);
	}
	public static void occurence(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(a[i] != -1)
			{
				for(int j=i+1;j<a.length;j++)
				{	
					if(a[j]!= -1)
					{
						if(a[i]==a[j])
						{
							count++;
							a[j]= -1;
						}
					}
				}
				if(count==1)
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
