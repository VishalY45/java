import java.util.Scanner;
public class Sumofarry
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter a array");
int a[]=new int[5];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("\nDisplay Array\n");
for(int i=0;i<a.length;i++)
{
System.out.printf("%d\t",a[i]);
}
int sum=0;
for(int i=0;i<a.length;i++)
{
  sum=sum+a[i];
}
System.out.printf("Sum:=%d\t",sum);
}
}

