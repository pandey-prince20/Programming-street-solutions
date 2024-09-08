import java.util.*;
public class question22{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int sum = 0;
        int end  = sc.nextInt();
        for(int i = start; i <= end; i++)
        {
            if(i % 2!= 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("sum of odd no: "+ sum);
    }
}