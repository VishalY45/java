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
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==65||ch[i]==97)
			{
				System.out.print(".-"+" ");
			}
			else if(ch[i]==66||ch[i]==98)
			{
				System.out.print("-...");
			}
			else if(ch[i]==67||ch[i]==99)
			{
				System.out.print("-.-.");
			}
			else if(ch[i]==68||ch[i]==100)
			{
				System.out.print("-..");
			}
			else if(ch[i]==69||ch[i]==101)
			{
				System.out.print(".");
			}
			else if(ch[i]==70||ch[i]==102)
			{
				System.out.print("..-.");
			}
			else if(ch[i]==71||ch[i]==103)
			{
				System.out.print("--.");
			}
			else if(ch[i]==72||ch[i]==104)
			{
				System.out.print("....");
			}
			else if(ch[i]==73||ch[i]==105)
			{
				System.out.print("..");
			}
			else if(ch[i]==74||ch[i]==106)
			{
				System.out.print(".---");
			}
			else if(ch[i]==75||ch[i]==107)
			{
				System.out.print("-.-");
			}
			else if(ch[i]==76||ch[i]==108)
			{
				System.out.print(".-..");
			}
			else if(ch[i]==77||ch[i]==109)
			{
				System.out.print("--");
			}
			else if(ch[i]==78||ch[i]==110)
			{
				System.out.print("-.");
			}
			else if(ch[i]==79||ch[i]==111)
			{
				System.out.print("---");
			}
			else if(ch[i]==80||ch[i]==112)
			{
				System.out.print(".--.");
			}
			else if(ch[i]==81||ch[i]==113)
			{
				System.out.print("--.-");
			}
			else if(ch[i]==82||ch[i]==114)
			{
				System.out.print(".-.");
			}
			else if(ch[i]==83||ch[i]==115)
			{
				System.out.print("...");
			}
			else if(ch[i]==84||ch[i]==116)
			{
				System.out.print("-");
			}
			else if(ch[i]==85||ch[i]==117)
			{
				System.out.print("..-");
			}
			else if(ch[i]==86||ch[i]==118)
			{
				System.out.print("...-");
			}
			else if(ch[i]==87||ch[i]==119)
			{
				System.out.print(".--");
			}
			else if(ch[i]==88||ch[i]==120)
			{
				System.out.print("-..-");
			}
			else if(ch[i]==89||ch[i]==121)
			{
				System.out.print("-.--");
			}
			else if(ch[i]==90||ch[i]==122)
			{
				System.out.print("--..");
			}
			else if(ch[i]==48)
			{
				System.out.print("-----");
			}
			else if(ch[i]==49)
			{
				System.out.print(".----");
			}
			else if(ch[i]==50)
			{
				System.out.print("..---");
			}
			else if(ch[i]==51)
			{
				System.out.print("...--");
			}
			else if(ch[i]==52)
			{
				System.out.print("....-");
			}
			else if(ch[i]==53)
			{
				System.out.print(".....");
			}
			else if(ch[i]==54)
			{
				System.out.print("-....");
			}
			else if(ch[i]==55)
			{
				System.out.print("--...");
			}
			else if(ch[i]==56)
			{
				System.out.print("---..");
			}
			else if(ch[i]==57)
			{
				System.out.print("----.");
			}
			else 
				System.out.print(" ");
		    }
		
	}
}
class StringToMorseApp{
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