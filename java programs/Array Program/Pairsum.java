import java.util.*;
public class Pairsum
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
System.out.printf("\nEnter a sum");
int sum=sc.nextInt();
System.out.printf("\nDisplay Index");
for(int i=0;i<a.length-1;i++)
{
  for(int j=i+1;j<a.length;j++)
  {
    if(a[i]+a[j]==sum)
	{
	  System.out.printf("\n%d\t%d",i,j);
	  }
	  }
	  }
	 }
}	 