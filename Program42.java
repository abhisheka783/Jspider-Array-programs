//Move all negative numbers to beginning and positive to end
import java.util.Arrays;
class Program42
{
	public static void main(String[] args)
	{
		int[] a={-12,11,-13,-5,6,-7,5,-3,-6};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		int[] res=shift(a);
		for(int i:res)
			System.out.print(i+" ");

	}
	public static int[] shift(int[] a)
	{
		int j=0;
		while(j<a.length)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>0)
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			j++;
		}
		return a;
	}
}