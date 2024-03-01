import java.util.*;
class PrimeNo
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		boolean flag=false;
		int sum=0;
		for(int i=2;i<=no;i++)
		{
			flag=false;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(flag!=true)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum Is"+sum);
	}
}