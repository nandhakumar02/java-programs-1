import java.util.*;
public class count
{
    public static void main(String args[])
{
        Scanner s=new Scanner(System.in);
        int a,i,n,pos=0,neg=0,zer=0;
        System.out.println("Enter number of elements:");
        n=s.nextInt();
        System.out.println("Enter the numbers:");
        for(i=0;i<n;i++)
        {
        a=s.nextInt();
        if(a>0)
           pos++;
        else if(a<0)
           neg++;
        else if(a==0)
           zer++;
        }
System.out.println("Positive numbers - "+pos+"\nNegative numbers - "+neg+"\nZeros - "+zer);
s.close();
}
}