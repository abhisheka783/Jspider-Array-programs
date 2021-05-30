/*Find the Missing Number
   Input: arr[] = {1, 2, 4, 6, 3, 7, 8,11}
   Output: 5
   Explanation: The missing number from 1 to 8 is 5*/
import java.util.Arrays;
class Program43
{
	public static void main(String[] args)
	{
		int[] a={1,2,4,6,3,7,8,11}; 
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		Arrays.sort(a);
		pair(a);
	}
	public static void pair(int[] a)
	{
		
		int n;
		for(int i=0;i<a.length-1;i++)
		{
			n=a[i+1]-a[i];
			if(n>1)
			{
				for(int j=0;j<n-1;j++)
				{
					System.out.print(++a[i]+" ");
				}
			}
		}
	}
}
	