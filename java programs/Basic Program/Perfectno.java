import java.util.Scanner;
public class Perfectno
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int no=sc.nextInt();
int sum=0;
for(int i=1;i<no;i++)
{
if(no%i==0)
{
sum=sum+i;
}
}
if(sum==no)
{
System.out.println("No is perfect");
}
else
{
System.out.println("No is Not perfect");
}
}
}