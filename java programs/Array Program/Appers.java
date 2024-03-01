import java.util.*;
public class Appers
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
System.out.printf("\n Enter a no");
int no=sc.nextInt();
int count=1;
for(int i=0;i<a.length-1;i++)
{
	if(a[i]==no)
	{
		count++;
	}
}
System.out.printf(" The %d Appers more than %d times in array ",no,count);
}
}
		