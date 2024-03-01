import java.util.Scanner;
public class Rotate
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter a array");
int a[]=new int[7];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("\nDisplay Array\n");
for(int i=0;i<a.length;i++)
{
System.out.printf("%d\t",a[i]);
}
System.out.printf("Enter a Position");
int pos=sc.nextInt();
int a2[]=new int[7];
int temp;
for(int i=0;i<pos;i++)
{
	temp=a[0];
	for(int j=1;j<a.length;j++)
	{
		a[j-1]=a[j];
	}
	a[a.length-1]=temp;
}
for(int i=0;i<a.length;i++)
{
	System.out.printf("%d\t",a[i]);
}
}
}

