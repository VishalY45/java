/*.       *
             *  1  *
              * 1 2 1 *
               * 1 2 3 2 1 *
                * 1 2 1*
               * 1 *
                *
*/
import java.util.*;
class Star2
{
	public static void main(String s[])
	{
		//Scanner sc=new Scanner(System.in);
		int f=1;
		int m=3;
		int k=0;
		int kk=0;
		for(int i=1;i<=7;i++)
		{
			if(i<=4)
			 k=(2*i)-1;
			else
				 kk=(2*m)-1;
			
		     f=1;
			for(int j=1;j<=7;j++)
			{
				
				if((i<=4&&j<=(2*i)-1)||(i>4&&j<=(2*m)-1))
				{
					
					if((j==1||j==(2*i)-1)||j==kk)
					{
						System.out.print("*");
					}
					else
					{
					System.out.print(f);
					if(j<i)
					f++;
					else
						f--;
					}
				}
			}
			System.out.println(" ");
			if(i>4)
				m--;
		}
		}
	}
