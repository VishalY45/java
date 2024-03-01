

import java.util.Scanner;

interface CharOpeartor
{
	public void setchar(char[] ch);
	public char[] GetResult();
	
}
class ConUpr implements CharOpeartor
{
	private char[] ch;
	public void setchar(char[] ch)//@
	{
		this.ch=ch;
	}
	public char[] GetResult()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			ch[i]=(char)(ch[i]-32);
			else
			{
				ch[i]=ch[i];
			}
		}
		return ch;
	}
}
class conver implements CharOpeartor
{
	private char[] ch;
	public void setchar(char[] ch)
	{
		this.ch=ch;
	}
	public char[] GetResult()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0&&ch[i]>='a'&&ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
			else if(i%2==1&&ch[i]>='A'&&ch[i]<='Z')//
			{
				ch[i]=(char)(ch[i]+32);
			}
			else
			{
				ch[i]=ch[i];
			}
				
			
		}
		return ch;
	}
}
public class StringProgram {

   final	public static void main(String ...x) 
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Char Array");
		char ch[]=new char[10];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		ConUpr c=new ConUpr();
		c.setchar(ch);
		char[] result=c.GetResult();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		conver c1=new conver();
		c1.setchar(ch);
		result=c1.GetResult();
		System.out.println();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
		
	}
}
