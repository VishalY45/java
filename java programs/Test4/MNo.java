/*
Write a program to find the majority element of an array
 ? A majority element in an array A[] of size n is an
 element that appears more than n/2 times (and hence there
 is at most one such element). Expected 
Output : The given array is : 4 8 4 6 7 4 4 8 There are 
\no Majority Elements in the given array(*/
import java.util.*;
class MNo
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Array no");
		int a[]=new int[8];
		int len=a.length;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter no ");
		int no=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==no)
			{
				for(int j=0;j<a.length;j++)
				{
					if(no==a[j])
					{
						count++;
					}
				}
			}
		}
		if(count>(len/2))
		{
			System.out.println("No is Mejority");
		}
		else
		{
			System.out.println("No is Not Mejority");
		}
	}
}
		
		
