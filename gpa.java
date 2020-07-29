import java.util.*;
public class gpa
{
public static void main(String args[])
{
        int a,n,i,c,tc=0;
        double g,sum=0.0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter subjects-"+(i+1)+" grade and credits:");
            g=s.nextDouble();
            c=s.nextInt();
            sum=sum+(g*c);
            tc=tc+c;
        }
        System.out.println("GPA:  "+sum+'\r'+c);
s.close();
}
}