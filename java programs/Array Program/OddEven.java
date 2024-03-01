import java.util.*;
public class OddEven
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
System.out.printf("\nEven Array\n");
for(int i=0;i<a.length;i++)
{
  if(a[i]%2==0)
  {
    System.out.printf("%d\n",a[i]);
}
}
System.out.printf("\n Odd Array\n");
for(int i=0;i<a.length;i++)
{
  if(a[i]%2==1)
  {
    System.out.printf("%d\n",a[i]);
}
}
}
}