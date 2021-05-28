//Removing the element from specific position 
class Program25 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int res[]=removeelem(a,3);
		for (int i:res)
		{
			System.out.print(i+" ");
		}
	}
	public static int[] removeelem(int[] a,int pos)
	{
		int[] res=new int[a.length-1];
		int i=0;
		for(;i<pos;i++)
		{
			res[i]=a[i];
		}
		for(;i<a.length-1;i++)
		{
			res[i]=a[i+1];
		}
		return res;

	}
}
