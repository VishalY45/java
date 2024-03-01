import java.util.Scanner;
public class FIndPairWithDiff{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]=new int[5];
		System.out.printf("Enter a Array elelment");
		
        for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
		System.out.printf("\n Display Arry\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("Enter a Sum");
		int sum=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			
		}
		System.out.printf("\n===================Display Array ======================\n");
		for(int i=0;i<a.length;i++)
		{
           System.out.printf("%d\t",a[i]);			
		}
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]-a[j])==sum)
				{System.out.printf("%d\t",a[i]);
					System.out.printf("\n\n The Pair Is.....{%d,%d}",a[i],a[j]);
				}
			}
		}
	}
}
		