import java.util.*;
class primeno
{
    public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println("Prime No");
		for(int i=no1;i<=no2;i++)
		{
			int k=i;
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(i);
			}
		}
	}
}