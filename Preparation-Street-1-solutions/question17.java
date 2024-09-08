import java.util.*;
public class question17 {
    public static boolean isArmstrong(int i )
    {
        int sum = 0; 
        int n = i;
        while( i > 0)
        {
            int lastDigit = i % 10;
            sum = sum + lastDigit * lastDigit * lastDigit;
            i = i / 10;
        }
        if( sum == n)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         int start = sc.nextInt();
         int end = sc.nextInt();
         for(int i = start; i <= end; i++)
         {
           if(isArmstrong(i))
           {
            System.out.println(i);
           }
         }
    }
}
