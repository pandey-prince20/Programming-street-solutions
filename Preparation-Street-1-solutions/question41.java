public class question41 {
    public static void main(String args[])
    {
        int n = 123333;
        int key = 3;
        int count = 0;
        while( n > 0)
        {
            int lastDigit = n % 10;
            if( lastDigit == key)
            {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
