//To compare two array using Arrays.equals(a,b)
import java.util.Arrays;
class Program20 
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
		compare(a,b);
	}
	public static void compare(int[] a,int[] b)
	{
		if(Arrays.equals(a,b))
			System.out.println("Equals");
		else
			System.out.println("Not Equals");
	}
}
