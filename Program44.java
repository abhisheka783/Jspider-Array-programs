//smallest prime number in given series of number
import java.util.Scanner;
class Program44
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter series of number");
        String input = sc.nextLine();
        String [] inputarray = input.split(" ");
        PrintPrime(inputarray , inputarray.length);
    }

    public static void PrintPrime(String s[] , int n )
	{
		int smallest=Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
		{
            int x = Integer.parseInt(s[i]);
			if(isprime(x))
				{
					if(x<smallest)
					{
						smallest=x;
					
					}
				}
		}
		if(smallest==1)
		{
			System.out.println("Array doesnt have prime no.");
		}
		else
		{
			System.out.println("Smallest of prime numbers is "+smallest);
		}
	}

    public static boolean isprime(int n)
	{
        if(n == 1) 
			return false;
        for(int u = 2; u < n; u++)
		{
            if(n % u == 0) 
				return false;
        }
        return true;
    }
}