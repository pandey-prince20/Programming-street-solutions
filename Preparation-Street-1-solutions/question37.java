import java.util.*;
public class question37{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n / 2; i++)
        {
            if( Math.pow(i,2)== n)
            {
                System.out.println("yes");
                break;
            }
        }
    }
}