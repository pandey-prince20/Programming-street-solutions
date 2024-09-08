import java.util.*;
public class question24{
    public static boolean isPrime(int n)
    {
        if( n == 2)
        {
            return true;
        }
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 2; i < num; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+", ");
            }
        }
    }
}