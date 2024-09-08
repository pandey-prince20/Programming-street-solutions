import java.util.*;
public class question14 {
    public static void main(String args[])
    {
        int arr[] = { 2,12,55,52,242,1,64,23,11};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
            if( arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println("largest: "+ largest +"\n Smallest: "+ smallest);

    }
}
