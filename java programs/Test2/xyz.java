import java.util.*;
interface StringOpe
{
	void getresult();
}
class StringToBinary implements StringOpe
{
	private String str;
	public void setString(String str)
	{
		this.str=str;
	}
	public void getresult()
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c=(int)ch[i];
			int a[]=new int[8];
			for(int j=7;j>=0;j--)
			{
				a[j]=c%2;
				c=c/2;
			}
		  for(int aa:a)
		  {
			  System.out.print(aa+" ");
		  }
		  System.out.println(" ");
	}
	}
}
class StringToMorse implements StringOpe
{
	private String str;
	public void setString(String str)
	{
		this.str=str;
	}
	public void getresult()
	{
		char c[]=str.toCharArray();
		String s=".- -... -.-. -.. . ..-. --. "
			+ ".... .. .--- -.- .-.. -- -. --- .--. --.- "
			+ ".-. ... - ..- ...- .-- -..- -.-- --.. ----- .---- "
			+ "..--- ...-- ....- ..... -.... --... ---.. ----.";
			String ss=s.split(" ");
			char c1[]=ss.toCharArray();
			char ch[]=new char[ss.length];
			int index=65;
			for(int i=0;i<ss.length;i++)
			{
				ch[i]=index++;
			}
			String result="";
			for(int i=0;i<ss.length;i++)
			{
				int cc=(int)ch[i];
				if(ch[i]==cc)
				{
					result=result+c1[i];
				}
			}
			System.out.println("The Morse Code Is"+result);
		
	}
}
class xyz{
	 public static void main(String args[])
	 {
		 StringToBinary s1=new StringToBinary();
		 s1.setString("A");
		 s1.getresult();
		 StringToMorse s2=new StringToMorse();
		 s2.setString("a");
		 s2.getresult();
	 }
}