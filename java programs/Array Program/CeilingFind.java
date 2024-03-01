import java.util.*;
public class CeilingFind
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter a array");
int a[]=new int[6];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("\nDisplay Array\n");
for(int i=0;i<a.length;i++)
{
System.out.printf("%d\t",a[i]);
}
int a2[]=new int[6];
for(int i=0;i<a[a.length-1];i++)
{
 if(i==0||i==a.length-1)
  a2[i]=-1;
  for(int j=i+1;j<a.length;j++)
  {
  if(i<=a[j]&&i>=a[j])
  {
   System.out.printf("%d Ceiling is %d Floor is %d",i,a[i],a[i]);
   }
  }
}
}
}