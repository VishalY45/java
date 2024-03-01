import java.util.Scanner;
class DuckNo{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int no=sc.nextInt();
int f=0;
while(no!=0)
{
int rem=no%10;
no=no/10;
if(rem==0)
{
 f=1;
break;
}
}
if(f==1)
{
System.out.println("No is Duck");
}
else
{
System.out.println("No is Not Duck");
}
}
}