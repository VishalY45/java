import java.util.*;
public class MovingZero
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
System.out.printf("\nResult Array\n");
int j=0,k=1;
for(int i=0;i<a.length;i++)
{
	if(a[i]!=0)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		j++;
	}
}
for(int i=0;i<a.length;i++)
{
	System.out.printf("%d\t",a[i]);
}
}
}