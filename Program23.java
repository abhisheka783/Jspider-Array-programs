//merge two arrays element into 3rd array in zig-zag manner
class Program23 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50,60,70,80,90};
		int[] b={100,200,300,400,500,600};
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:b)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int res[]=mergearr(a,b);
		for(int i:res)
		{
			System.out.print(i+" ");
		}
	}
	public static int[] mergearr(int[] a,int[] b)
	{
		int[] res=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			res[k++]=a[i++];
			res[k++]=b[j++];
		}
		while(i<a.length)
		{
			res[k++]=a[i++];
		}
		while(j<b.length)
		{
			res[k++]=b[j++];
		}
		return res;
	}
}
