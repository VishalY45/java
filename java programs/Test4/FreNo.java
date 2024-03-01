import java.util.*;
class FreNo
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		int rem3=0;
		int temp=no;
		int temp2=no;
		while(no!=0)
		{
			int count=0;
			int rem=no%10;
			 temp=temp2;
			if(rem!=rem3)
			{  
				while(temp!=0)
				{
					
					int rem2=temp%10;
					if(rem==rem2)
					{
						count++;
					}
					temp=temp/10;
				}
			System.out.printf("\n%d---->%d\n",rem,count);
			}
			no=no/10;
			rem3=rem;
		}
	}
}