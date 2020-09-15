package string.handling;
import java.util.*;
public class StringHandling {
    public static void main(String[] args) {
       int n;
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = obj.nextLine();
        StringTokenizer obj1 = new StringTokenizer(s, " ");
        while (obj1.hasMoreTokens()) {
            String temp = obj1.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        obj.close();
    }
}
    

