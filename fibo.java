import java.util.*;
public class fibo
{
    public static void main(String args[])
{
                  int p=-1,c=1,nx=0,n,i;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	System.out.println("fibonacci series is ");
	for(i=0;i<n;i++)
	{  
                     nx=c+p;
                     System.out.println('\r'+c);
	   p=c;
	   c=nx;   
	}
s.close();
}
}