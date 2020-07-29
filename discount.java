import java.util.*;
public class discount
{
    public static void main(String args[])
{
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter price: ");
        a=s.nextInt();
        System.out.println("Enter discount value: ");
        b=s.nextInt();
        c=a-(a*b/100);
        System.out.println("Discounted amount is\r"+c);
s.close();
}
}