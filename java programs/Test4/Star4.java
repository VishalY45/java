/*
.                                  1
                                    1  2  1  
                               1   2  3  2   1
                          1   2   3  4  3   2   1
                     1   2   3   4  5  4   3     2   1       
*/
import java.util.*;
class Star4
{
	public static void main(String s[])
	{
		for(int i=1;i<=5;i++)
		{
			int f=1;
			for(int j=1;j<=17;j++)
			{
				if(j>=10-i&&j<=8+i)
				{
					System.out.print(f);
					if(j<9)
						f++;
					else
						f--;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}