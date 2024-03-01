import java.util.*;
public class Factorial
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int no=sc.nextInt();
int f=1;
for(int i=1;i<=no;i++)
{
f=f*i;
}
System.out.printf("Fact is %d",f);
}
}