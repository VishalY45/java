import java.util.*;
abstract class Arrabs
{
	 int[] a;
	 int b[];
	public void setArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	abstract int[] getResult();
}
class Intersection extends Arrabs{
	public int[] getResult()
	{
		int k=0;
		int a2[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[i]==b[j])
				{
					a2[k]=a[i];
					k++;
					break;
				}
			}
		}
		k=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
			if(b[i]==a2[j])
			{
				
				a[k]=b[i];
				j++;
				break;
			}
			}
		}
		return a2;
	}
}
class Unionn extends Arrabs
{
	public int[] getResult()
	{
		int k=0;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<k;j++)
			{
				if(a[i]==c[j])
				{
					
					
					flag=true;
					break;
					
				}
			}
				if(!flag)
				{
					c[k]=a[i];
					k++;
				}
				
		}
		for(int i=0;i<b.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<k;j++)
			{
				if(c[j]==b[i])
				{
					flag=true;
					
					break;
					
				}
			}
			if(!flag)
			{
				c[k]=b[i];
				k++;
			}
			
		}
		return c;
	}
}
public class Second{
	public static void main(String sa[])
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
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		Intersection I1=new Intersection();
		I1.setArray(a,b);
		int res[]=I1.getResult();
		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=0)
			System.out.print(res[i]+" ");
		}
		Unionn u=new Unionn();
		u.setArray(a,b);
		int[] res2=u.getResult();
		System.out.println();
		int size3=size+size2;
		for(int i=0;i<size3;i++)
		{
			if(res2[i]!=0)
			System.out.print(res2[i]+" ");
		}
	}
}
		
					
				
	
	