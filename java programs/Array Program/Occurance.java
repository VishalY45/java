import java.util.Scanner;
public class Occurance{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]=new int[10];
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
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}
			if(a[i]!=-1)
			System.out.printf("\nThe Occurance of %d is :=%d\n",a[i],count);
		}
	}
}