//print all duplicate element of a given input array
class Program32
{
	public static void main(String[] args) 
	{
		int[] a={2,5,7,6,5,5,5,5,2,7,2,1};
		for(int i : a)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("array after removing all duplicates of the above given array");
		int[] res=occurence(a);
		for(int i : res)
			System.out.print(i+" ");
	}
	public static int[] occurence(int[] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != -1)
			{
				for(int j=i+1;j<a.length;j++)
				{	
					if(a[j]!= -1)
					{
						if(a[i]==a[j])
						{
							a[j]= -1;
							count++;
						}
					}
				}
			}
		}
		int[] res=new int[a.length-count];
		int k=0;
		while(k<a.length-count)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!= -1)
					res[k++]=a[i];
			}
		}
		return res;
	}
}
