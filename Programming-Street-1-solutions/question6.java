
import java.util.*;
public class question6 {
    public static void main(String args[])
    {
       Scanner sc  = new Scanner(System.in);
       String str = sc.next();
       StringBuffer str1 = new StringBuffer(str);
       String strrev = str1.reverse().toString();
       if(str.equals(strrev))
       {
        System.out.println("pallindrome");
       }
       else{
        System.out.println("not pallindrome");
       }
    }
}
