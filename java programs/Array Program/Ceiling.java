import java.util.Scanner;
public class Ceiling
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
System.out.printf("Enter a Ceilng");
int ceil=sc.nextInt();
for(int i=0;i<a.length;i++)
{
	if(a[i]>=ceil)
	{
		System.out.printf("The Ceiling if %d Is %d",ceil,a[i]);
		break;
	}
}
}
}