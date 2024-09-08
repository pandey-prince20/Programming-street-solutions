
import java.util.*;
public class question4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while( n > 0)
        {
            int lastdigit = n % 10;
            sum = sum + lastdigit * lastdigit * lastdigit;
            n  = n / 10;
        }
        if( sum == temp)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}
