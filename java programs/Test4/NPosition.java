/*Write a program  to rotate an array by N positions ?  
Expected Output : 
The given array is : 0 3 6 9 12 14 18 20 22 25 27 
From 4th position the values of the array are : 12 14 18 20 22 25 27
 Before 4th position the values of the array are : 0 3 6 9 
After rotating from 4th position the array is:
 12 14 18 20 22 25 27 0 3 6 9
*/
import java.util.*;
class NPosition
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter index");
		int index=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		System.out.println("Display Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}