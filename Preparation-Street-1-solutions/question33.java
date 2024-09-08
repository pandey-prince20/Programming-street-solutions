public class question33 {
    public static void main(String args[])
    {
        int base = 3;
        int pow = 3;
        int result = 1;
        for(int i = 0; i<pow; i++)
        {
            result = result * base;
        }
        System.out.println(result);
    }
}
