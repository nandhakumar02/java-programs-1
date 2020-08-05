package nandha;
import java.util.*; 
public class Harmonic 
{
	public static void main(String[] args) 
	{
	  int n,i;
	  double sum=0,x;
	  Scanner s=new Scanner(System.in);	 
	  System.out.println("enter n value");
	  n=s.nextInt();
	  System.out.println("Harmonic value is");
	  for(i=1;i<=n;i++)
	  {	  
		  x=(double)1/i;
		  System.out.println(" "+x);
		  sum=sum+x;		  
	  }
	  System.out.println("output is"+sum);
	  s.close();
	}	
}
