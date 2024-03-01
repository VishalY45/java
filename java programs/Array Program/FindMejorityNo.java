import java.util.*;
public class FindMejorityNo
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter a array");
int a[]=new int[9];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
int f=0;
int p=0;
System.out.printf("\nDisplay Array\n");
for(int i=0;i<a.length;i++)
{
System.out.printf("%d\t",a[i]);
}
for(int i=0;i<a.length;i++)
{
int count=0;
for(int j=i+1;j<a.length;j++)
{
  if(a[i]==a[j])
  {
  count++;
  }
}
if(count>=a.length/2)
{   p=a[i];
   f=1;
}
}
if(f==1)
System.out.printf("The Mejority Elelent is :=%d",p);
else
System.out.printf("The No Mejority Elelent is :=%d");
}
}