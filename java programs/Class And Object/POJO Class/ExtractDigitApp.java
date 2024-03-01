/*WAP to create class name as ExtractDigitAndCalSum with two methods
void setCharArray(char []): this function is used for accept input as character array
int getSum(): this function can extract digit from character array and calculate its sum and return it.

Example: abc123mno456
Output: sum  = 1+2+3+4+5+6 = 21
*/
import java.util.Scanner;
class Extract{
    private char ch[];
	private int sum=0;
	public void setCharArray(char ch[])
	{
		this.ch=ch;
	}
	public int getsum()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				sum=sum+( (char)((int)ch[i]-48));
			}
		}
		return sum;
	}
}
public class ExtractDigitApp{
	public static void main(String s[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string");
	    String str=sc.nextLine();
	    char ch[]=str.toCharArray();
		Extract E=new Extract();
		E.setCharArray(ch);
		int result=E.getsum();
		System.out.println("The Sum Is"+result);
	}
}
		
			
	