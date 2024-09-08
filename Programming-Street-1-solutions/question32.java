import java.util.*;
public class question32 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("input array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ,");
        }
        Arrays.sort(arr);
        System.out.println("sorted array");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ,");
        }
        float median = -1.0f;
        int m = n / 2;
        if( n % 2 == 0)
        {
         
          median = (arr[m-1] + arr[m])/2f;
        }
        else{
            median = arr[m-1];
        }
        System.out.println("median is: "+ median);
    }
}
