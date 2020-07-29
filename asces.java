import java.util.*;
public class asces
{
public static void main(String args[])
{
        int a[]=new int[100];
        int n,i,j,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers of elements:");
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
        System.out.println("Enter the numbers : ");
        a[i]=s.nextInt();
        }
for(i=0;i<n;i++)
{
    for(j=i+1;j<n;j++)
    {
        if(a[i]>a[j])
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
System.out.println("Ascending order :");
for(i=0;i<n;i++)
{
 System.out.println('\r',+a[i]);
}
s.close();
}
}