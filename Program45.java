//Largest of 3 number in series of number
import java.util.*;
class Program45
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter series of number");
        String input = sc.nextLine();
        String [] inputarray = input.split(" ");
        int max = PrintMax1(inputarray , inputarray.length);
		System.out.print("The maximum number in the series is ");
        System.out.println(max);
    }
    static int PrintMax1(String s[] , int n )
	{
        int max = Integer.parseInt(s[0]);
        for(int i = 1; i < n; i++)
		{
            int x = Integer.parseInt(s[i]); 
            if(x > max)
                max = x;
        }
        return max;
    }

}