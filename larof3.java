import java.util.*;
public class larof3
{
public static void main(String args[])
{
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        a=s.nextInt();
        System.out.println("Enter 2nd number:");
        b=s.nextInt();
        System.out.println("Enter 3rd number:");
        c=s.nextInt();
        if(a>b && a>c)
            System.out.println(a+" is largest");
        
        else if(b>c)
            System.out.println(b+" is largest");
        
        else
            System.out.println(c+" is largest");
        
s.close();
}
}