import java.util.*;
public class question11 {
    public static void main(String args[])
    {
        int gcd = 1;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int min = Math.min(a,b);
        for(int i = 2; i <= min; i++)
        {
            if( a % i == 0 && b % i == 0)
            {
                gcd = i;
                
            }
        }
        int lcm = a * b / gcd;
        System.out.println(lcm);

    }
}
