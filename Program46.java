//Negative number in series of number
import java.util.Scanner;
class Program46
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter your series of number");
        String input = sc.nextLine();
        String[] inputarray = input.split(" ");
		 System.out.println("series of -ve integer");
        solve(inputarray);
    }
    public static void solve(String s[])
	{
        for(String a : s)
		{
            int x = Integer.parseInt(a);
            if(x < 0)
                System.out.print(x+ " ");
        }
    }

}