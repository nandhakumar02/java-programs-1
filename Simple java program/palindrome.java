class palindrome
{
public static void main(string args[])
{
int r,sum=0,temp;
scanner in = new scanner(system.in)
system.out.println("enter a number");
int n=in.nextInt();
int sum=0,r;
int temp =n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
 system.out.println("it is a palindrome number");
}
else
{
 system.out.println("not a palindrome number");
}
}
}