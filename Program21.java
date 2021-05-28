//To compare two array without using Arrays.equals(a,b)
class Program21 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int[] b={10,20,30,40,50,60};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		for(int i:b)
			System.out.print(i+" ");
		System.out.println();
		if(compare(a,b))
			System.out.println("Equals");
		else
			System.out.println("not equal");
	}
	public static boolean compare(int[] a,int[] b)
	{
		if(a.length!=b.length)
			return false;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					return false;
				}

			}
		return true;
	}
}
