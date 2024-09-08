public class question23 {
    public static void main(String args[])
    {
        int position = 6;
        int a = 0;
        int b = 1;
        int c = -1;
        while( position-2 > 0)
        {
            c = a + b;
            a= b;
            b = c;
            position--;   
        }
        System.out.println(c);
    }
}
