import java.util.Scanner;
class convert{
	char ch[];
	void setchar(char ch[])
	{
		this.ch=ch;
	}
	void converttoupr()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=97&&ch[i]<=122)
			{
				ch[i]=(char)((int)ch[i]-32);
			}
		}
	}
	void show()
	{
		for(int i=0;i<ch.length;i++)
		{
			System.out.printf("%c",ch[i]);
		}
		
	}
}
public class ConToUprS
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner (System.in);
		//
		System.out.printf("Enter a string");
	String str=sc.nextLine();
	char ch[]=str.toCharArray();
		convert c1=new convert();
		c1.setchar(ch);
	    System.out.printf("\nBefore conversion");
		c1.show();
		c1.converttoupr();
		System.out.printf("\nAfter conversion");
		c1.show(); 
	}
}