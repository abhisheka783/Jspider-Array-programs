//count of zero and one in series of binary number
import java.util.*;
class Program49
{
    public static void main(String[] args) 
	{
        Scanner xc = new Scanner(System.in);
		System.out.println("Enter series of binary number");
        String input_string = xc.nextLine();
        String[] a = input_string.split(" ");
		System.out.println("Number of zero and one in seies ");
        solve(a);
    }
    public static void solve(String s[])
	{
        for(int i = 0; i < s.length; i++)
		{
            int x = Integer.parseInt(s[i]);
            System.out.println("number -> " + x);
            int zero = 0;
            int one = 0;
            while(x > 0)
			{
                int mod = x % 10;
                if(mod == 1) 
					one++;
                if(mod == 0) 
					zero++;
                x /= 10;
            }
            System.out.println("1 -> " + one);
            System.out.println("0 -> " + zero);
            System.out.println("--------------");

        }
    }

}