//Consecutive even and odd
import java.util.*;
class Program48
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter series of number");
        String input= sc.nextLine();
        String[] s = input.split(" ");
        CheckTwoConsecutiveEvenOdd(s);
    }

    public static void CheckTwoConsecutiveEvenOdd(String s[])
	{
		for(int i = 0; i< s.length - 1; i++)
		{
           int x = Integer.parseInt(s[i]);
           int y = Integer.parseInt(s[i + 1]);
           if(isEvenOdd(x , y)){
               System.out.print("true" + " ");
           }
           else{
               System.out.print("false" + " ");
           }
       }
    }

    public static boolean isEvenOdd(int x , int y)
	{
		if(x % 2 == 0 &&  y % 2 ==0)
			return true;
        else if(x % 2 != 0 && y % 2 != 0)
            return true;
        else
			return false;
    }

}