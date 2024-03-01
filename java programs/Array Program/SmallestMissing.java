import java.util.Scanner;
public class SmallestMissing
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
	for(int j=a[i];j<(a[i+1])-1;)
	{
		System.out.printf("Smallest No:=%d",++j);
		break;
	}
	break;
}
}
}