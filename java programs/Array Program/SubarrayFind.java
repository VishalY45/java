import java.util.*;
public class SubarrayFind
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
System.out.printf("Enter a index ");
int ind1=sc.nextInt();
int ind2=sc.nextInt();
for(int i=0;i<a.length;i++)
{
	if(i>=ind1&&i<=ind2)
	{
		
	for( i=ind1;i<=ind2;i++)
	{
	
			System.out.printf("%d\t",a[i]);
	}
	}
	
}
}
}