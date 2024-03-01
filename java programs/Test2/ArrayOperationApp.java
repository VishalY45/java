

import java.util.Scanner;

interface ArrayOperation
{
	public void performOperation(int a[]);
}
class Sort implements ArrayOperation
{
	
	public void performOperation(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
class Insert implements ArrayOperation
{
	int a[];
	int index;
	int value;
	public void setValue(int index,int value)
	{
		
		this.index=index;
		this.value=value;
	}
	public void performOperation(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(i==index)
			{
				a[index]=value;
			}
		}
	
	System.out.println("After Inserting");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}
}
class Deletion implements ArrayOperation
{
	
	int value;
	public void setValue(int value)
	{
		
		
		this.value=value;
	}
	public void performOperation(int a[])
	{
		boolean flag=false;
		int i;
		for( i=0;i<a.length-1;i++)
		{
			if(a[i]==value)
			{
				flag=true;
				break;
			}
		}
		for(int j=i;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
	System.out.println("After Inserting");
	for( i=0;i<a.length-1;i++)
	{
		System.out.print(a[i]+" ");
	}
	}
	
}
class Rev implements ArrayOperation
{
	
	public void performOperation(int a[])
	{
		int len=a.length-1;
		int mid=a.length/2;
		int s=0;
		for(s=0;s<mid;s++)
		{
			int temp=a[s];
			a[s]=a[len];
			a[len--]=temp;
		}
		System.out.println("After Rev");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
public class ArrayOperationApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1:for sort");
			System.out.println("2:for insert");
			System.out.println("3:for delete");
			System.out.println("4:for rev");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Sort s1=new Sort();
				System.out.println("Enter array");
				int a[]=new int[5];
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				s1.performOperation(a);
				break;
			case 2:
				System.out.println("Enter index and value");
				int index=sc.nextInt();
				int value=sc.nextInt();
				Insert s2=new Insert();
				s2.setValue(index, value);
				System.out.println("Enter array");
				 int aa[]=new int[5];
				for(int i=0;i<aa.length;i++)
				{
					aa[i]=sc.nextInt();
				}
				s2.performOperation(aa);
				break;
			case 3:
				System.out.println("Enter value");
				 value=sc.nextInt();
				Deletion s3=new Deletion();
				s3.setValue(value);
				System.out.println("Enter array");
				 int a3[]=new int[5];
				for(int i=0;i<a3.length;i++)
				{
					a3[i]=sc.nextInt();
				}
				s3.performOperation(a3);
				break;
			case 4:
				System.out.println("Enter array");
				Rev s4=new Rev();
				 a=new int[5];
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				s4.performOperation(a);
			}
		}while(true);

	}

}
