import java.util.*;
class TestApp
{
	String s;
	public void setValue(String s)
	{
		this.s=s;
	}
	public void result()
	{
		String sss[]=s.split(" ");
		char ch[]=sss.toCharArray();
		int start=0;
		int mid=ch.length/2;
		int end=ch.length;
		for(start=0;start<mid;start++)
		{
			char temp=ch[start];
			ch[start]=ch[end-start-1];
			ch[end-start-1]=temp;
		}
		
		
	   System.out.println(new String(ch));
	  
	}
}
	
class Test1{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		TestApp t=new TestApp();
		t.setValue(s);
		t.result();
	}
}

		
			