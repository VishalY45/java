/*.   ********1********
        *******2*2*******
        ******3*3*3******
        *****4*4*4*4*****
        ****5*5*5*5*5****
*/
import java.util.*;
class Star1
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a array Number");
		int f=0;
		for(int i=1;i<=5;i++)
		{
			f=0;
			for(int j=1;j<=17;j++)
			{
				if(j>=10-i&&j<=9+i&&f==0)
				{
					System.out.print(i);
					f=1;
				}
				else
				{
					System.out.print("*");
					f=0;
				}
			}
			System.out.println(" ");
		}
	}
}