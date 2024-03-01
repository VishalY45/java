import java.util.Scanner;
public class MaxDiffrance{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]=new int[6];
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
		System.out.printf("\n Enter a no To find diff");
		int no=sc.nextInt();
		int no2=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==no||a[i]==no2)
			{
				if(no<=no2)
				{
					int temp=no2-no;
					System.out.printf("\tThe Diff Is :=%d",temp);
					break;
				}
				else
				{
					int temp=no-no2;
					System.out.printf("\tThe Diff Is :=%d",temp);
					break;
				}
			}
		}
	}
}
		