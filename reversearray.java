import java.util.*;
public class reversearray
{
public static void main(String args[])
{
        Scanner s=new Scanner(System.in);
        int i,j,n,k=1;
        int a[]=new int[100];
        System.out.println("Enter number of elements:");
        n=s.nextInt();
        for(i=0;i<n;i++)
           {
            System.out.println("Enter the element "+(i+1));
            a[i]=s.nextInt();
           }
        for(j=i-1;j>=0;j--)
        {
            System.out.println("Element "+(k)+" is "+a[j]);
            k++;
        }
        
s.close();
}
}