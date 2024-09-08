import java.util.*;
public class question26 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int temp1 = temp;
        int count = 0;
        while( n > 0)
        {
            count++;
            n = n / 10;
        }
        int sum = 0;
        while( temp1 > 0)
        {
            int lastDigit = temp1 % 10;
            sum = sum + (int)Math.pow(lastDigit,count);
            temp1 = temp1 / 10;
        }
        if( sum == temp)
        {
            System.out.println("Narcissistic Number");
        }
        else
        {
            System.out.println("not Narcissistic Number");
        }
        
    }
}
