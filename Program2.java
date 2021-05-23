//creating and initiallizing 
class Program2 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		double[] d={10.12,20.12,30.12,40.12,50.12};
		char[] ch={'a','e','i','o','u'};
		String[] s={"ab","hi","sh","ek"};
		System.out.println(a.length);
		System.out.println(d.length);
		System.out.println(ch.length);
		System.out.println(s.length);
		System.out.println();
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println();
		for(double dd:d)
		{
			System.out.println(dd);
		}
		System.out.println();
		for(char c:ch)
		{
			System.out.println(c);
		}
		System.out.println();
		for(String str:s)
		{
			System.out.println(str);
		}
	}
}
