import java.util.Scanner;
public class Ascending
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
for(int i=0;i<a.length-1;i++)
{
 for(int j=i+1;j<a.length;j++)
{
 if(a[i]>a[j])
 {
  int temp=a[i];
  a[i]=a[j];
  a[j]=temp;
}
}
}
System.out.printf("\nResult Array\n");
for(int i=0;i<a.length;i++)
{
System.out.printf("%d\t",a[i]);
}
}
}