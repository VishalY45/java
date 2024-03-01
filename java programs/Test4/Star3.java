
import java.util.*;
class Star3
{
	public static void main(String s[])
	{
		int k=0;
		for(int i=1;i<=5;i++)
		{
			int f=1;
			 k=0;
			for(int j=1;j<=9;j++)
			{
				if(j>=0+i&&j<=10-i&&k==0)
				{
					System.out.print(f);
					f++;
					k=1;
				}
				else
				{
					System.out.print(" ");
					k=;
				}
			}
			System.out.println(" ");
		}
	}
}
					