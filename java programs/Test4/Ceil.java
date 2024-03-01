import java.util.*;
class Ceil
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array Number");
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int f=-1;
		for(int i=0;i<11;i++)
		{
			i=-1;
			for(int j=0;j<a.length;j++)
			{
				if(i<=a[j]||i>=a[j])
				{
					
					System.out.printf("Number:%d ceiling is %d floor is:%d",i,a[j],a[i]);
				}
			}
			System.out.println(" ");
		}
	}
}
					
			
			
		