//series of item price and discount
import java.util.Scanner;
class Program47
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the series of item price");
        String input= sc.nextLine();
        String [] inputarray = input.split(" ");
		System.out.println("Series of item discounted price");
        solve(inputarray);
    }
    public static void solve(String s[])
	{
        for(int i = 0; i < s.length;i++)
		{
            int a = Integer.parseInt(s[i]);
            if(a <= 1000)
                System.out.print(a + " ");
            else if(a >= 1000 && a < 1500)
			{
                int y = (int)(a*0.9);
                System.out.print(y+ " ");

            }
            else
			{
                int y = (int)(a*0.8);
                System.out.print(y + " ");
            }
            
        }
    }

}