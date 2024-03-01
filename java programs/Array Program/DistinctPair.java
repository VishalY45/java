import java.util.*;
public class DistinctPair
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
System.out.printf("Enter a find pair sum");
int no=sc.nextInt();
System.out.printf("\nThe Distint Pair is......\n");
int count=0;
for(int i=0;i<a.length-1;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]+a[j]==no)
		{++count;
			System.out.printf("\n%d %d\n",a[i],a[j]);
		}
	}
}
System.out.printf("The Pair if Distinct is :=%d",count);
}
}