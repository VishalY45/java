import java.util.*;
class StrongNo
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		int temp=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		no=temp;
		if(sum==temp)
		System.out.println("No is Strong");
	   else
		System.out.println("no is not strong");
	}
}