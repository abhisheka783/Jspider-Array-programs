//# of pairs of integer in an array whose sum is equal to 'sum'
class Program40
{
	public static void main(String[] args) 
	{
		int[] a={10,12,10,15,-1,7,6,5,4,2,1,1,1};
		int sum=11;
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		int count=pair(a,sum);
		System.out.println(count+" pairs are there whose sum is "+sum);
	}
	public static int pair(int[] a,int sum)
	{
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum1=a[i];
				if(sum1+a[j]==sum)
					count++;
			}
		}
		return count;
	}
}
