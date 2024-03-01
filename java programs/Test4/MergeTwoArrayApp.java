import java.util.*;
class MergeTwoArray
{
	private int a[];
	private int b[];
	public MergeTwoArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	public int[] GetMergeArray()
	{
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		
		return c;
	}
}
public class MergeTwoArrayApp
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int c;
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Size");
		int size2=sc.nextInt();
		int b[]=new int[size2];
		int size3=size+size2;
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		MergeTwoArray m1=new MergeTwoArray(a,b);
		int[] result=m1.GetMergeArray();
		for(int i=0;i<size3;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
}
		