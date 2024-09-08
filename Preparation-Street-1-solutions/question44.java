import java.util.*;
public class question44{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int avg = 0;
        int sum = 0;
        for(int i = 0; i< n; i++)
        {
             sum = sum + arr[i];
        }
        avg = sum / n;
        System.out.println(avg);
    }
}