import java.util.*;
class removeDuplicate
{
	private int a[];
	int index=0;
	removeDuplicate(int []a)
	{
		this.a=a;
	}
	public void Operation()
	{
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{flag=false;
			for(int j=i+1;j<a.length;j++)//1 2 3 4 5 6 1 
			{
				if(a[i]==a[j])
				{
					flag=true;
				}
			}
			if(!flag)
			{
				a[index]=a[i];
				index++;
			}
		}
		
	}
	public void showArray()
	{
		for(int i=0;i<index;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
public class RemoveDuplicateApp
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter size");
		int size=sc.nextInt();
		System.out.println("Enter array elelemnt");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		removeDuplicate r=new removeDuplicate(a);
		r.Operation();
		r.showArray();
	}
}
			
		