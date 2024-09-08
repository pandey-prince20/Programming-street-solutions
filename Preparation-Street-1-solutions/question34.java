import java.util.*;
public class question34 {
    public static boolean isPrime(int n)
    {
        if( n == 1)
        {
            return false;
        }
        if(n == 2)
        {
            return true;
        }
        for(int i = 2; i < n; i++)
        {
            if( n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++)
        {
            if(isPrime(i))
            {
               sum = sum + i;
            }
        }
        System.out.println("sum of prime no: "+ sum);
    }
}
