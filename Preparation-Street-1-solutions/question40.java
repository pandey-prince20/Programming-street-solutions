public class question40 {
    public static int cal(int n)
    {
        int sum = 0;
        while( n > 0)
        {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n =  n / 10;
        }
        return sum;
    }
   public static int abc(int n)
   {
    if( n <= 9)
    {
        return n;
    }
    return abc(cal(n));
   }
    public static void main(String args[])
    {
        int n = 9875;
        System.out.println(abc(n));
    }
}
