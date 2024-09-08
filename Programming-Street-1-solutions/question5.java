import java.util.*;

public class question5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        while(c < n)
        {
           c = a + b;
           System.out.println(c);
           a = b;
           b = c;
           
        }
            
    }
}
