public class question42 {
    public static void fibbo(int n)
    {
        if( n == 0 || n == 1)
        {
            System.out.print(n);
        }
        return fibbo(n-1) + fibbo(n-2);
    }
    public static void main(String args[])
    {
        
    }
}
