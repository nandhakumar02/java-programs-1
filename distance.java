import java.util.*;
public class distance
{
    public static void main(String args[])
{
        Scanner s=new Scanner(System.in);
        double x1,x2,y1,y2,d;
        System.out.println("Enter the value of point A: ");
        x1=s.nextDouble();
        y1=s.nextDouble();
        System.out.println("Enter the value of point B: ");
        x2=s.nextDouble();
        y2=s.nextDouble();
        d=Math.sqrt(Math.pow(x1-x2, 2)*Math.pow(y1-y2, 2));
        System.out.println("Distance is  "+d);
s.close();
}
}