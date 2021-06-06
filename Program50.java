//consecutive zero and one print true if consecutive 1's occur,false if 0's
import java.util.*;
class Program50 
{
	public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter series of 0's and 1's without space");
        String input = sc.nextLine();
		ConsecutiveOneAndzero(input);
    }

   public static void ConsecutiveOneAndzero(String s)
	{
        for(int i = 0; i < s.length()-1; i+=2)
		{
            if((s.charAt(i)-48)==1 && (s.charAt(i + 1)-48)==1)
                System.out.print("true" + " ");
            else if((s.charAt(i)-48)==0 && (s.charAt(i + 1)-48)==0)
				System.out.print("false" + " ");
			
		}
    }
}