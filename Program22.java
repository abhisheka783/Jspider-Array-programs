//copy of two array element into another array
class Program22 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int[] b={100,200,300,400,500};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		for(int i:b)
			System.out.print(i+" ");
		System.out.println();
		int[] res=copyarray(a,b);
		for(int i:res)
			System.out.print(i+" ");
	}
	public static int[] copyarray(int[] a,int[] b)
	{
		int[] res=new int[a.length+b.length];
		int i=0;
		for(;i<a.length;i++)
		{
			res[i]=a[i];
		}
		for(int j=0;j<b.length;j++,i++)
		{
			res[i]=b[j];
		}
		return res;
	}
}
