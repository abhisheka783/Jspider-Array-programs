//sorting an array using Arrays.sort(a)
import java.util.Arrays;
class Program33 
{
	public static void main(String[] args) 
	{
		int[] a={10,32,30,52,41,10,9,5};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		Arrays.sort(a);
		for(int i:a)
			System.out.print(i+" ");
	}
}
