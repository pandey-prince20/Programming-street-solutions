public class question48 {
    public static boolean isPrime(int n)
    {
        if( n == 1)
        {
            return false;
        }
        if( n == 2)
        {
            return true;
        }
        for(int i  = 2; i < n; i++)
        {
            if ( n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int sum = 0;
        int n = 12;
        for(int i = 1; i < n; i++)
        {
            if( n % i == 0 && isPrime(i))
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
