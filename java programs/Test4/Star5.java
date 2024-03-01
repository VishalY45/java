/*
 1 
 1 1
 1 2 1
 1 3 3 1
1 4 6 4 1 
1 5 10 10 5 1
*/
import java.util.*;
class Star5
{
	public static void main(String s[])
	{
		for(int i=0;i<7;i++)
		{
			int f=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+f);
				f=f*(i-j)/(j+1);
			}
			System.out.println(" ");
		}
		
	}
}
