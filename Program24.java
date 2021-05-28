//add an element to ana array at specific position
class Program24 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		for (int i : a)
			System.out.print(i+" ");
		System.out.println();
		int[] narr=addelement(a,34,3);
		for (int i : narr)
			System.out.print(i+" ");
	}
	public static int[] addelement(int[] a,int key,int pos)
	{
		int[] narr=new int[a.length+1];
		int i=0;
		for(;i<pos;i++)
		{
			narr[i]=a[i];
		}
		narr[pos]=key;
		for(;i<a.length;i++)
		{
			narr[i+1]=a[i];
		}
		return narr;
	}
}
