import java.util.Scanner;
public class SearchArrayElement
{
public static void main(String aa[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter a no");
int a[]=new int[5];
for(int i=0;i<5;i++)
{
  a[i]=sc.nextInt();
}
System.out.printf("Enter a search no");
int no=sc.nextInt();
int f=0;
for(int i=0;i<5;i++)
{

if(no==a[i])
{
f=1;
break;
}
}
if(f==1)
{
System.out.printf("Value Is found");
}
else
{
System.out.printf("Value is Not Found");
}
}
}

  