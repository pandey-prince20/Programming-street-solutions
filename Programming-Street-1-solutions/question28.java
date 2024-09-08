import java.util.*;
public class question28{
    public static int factorial(int n)
    {
        if( n == 0 || n == 1)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        int sum = 0;
        while( fact > 0)
        {
            int lastDigit = fact % 10;
            sum  = sum + lastDigit;
            fact = fact / 10;
        }
        System.out.println("sum of factorial of no: " + sum);

    }
}