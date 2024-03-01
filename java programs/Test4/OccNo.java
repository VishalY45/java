/*WAP to enter the 10 element array and print the occurrence of every element*/
import java.util.*;
class OccNo
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array Number");
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=(int)' ';
				}
			}
			if(a[i]!=(int)' ')
			{
				System.out.printf("\n%d---->%d\n",a[i],count);
			}
		}
	}
}