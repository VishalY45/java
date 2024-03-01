import java.util.*;
class TestApp1
{
	String s;
	String s2;
	public void setValue(String s,String s2)
	{
		this.s=s;
		this.s2=s2;
	}
	public void result()
	{
		char ch[]=s.toCharArray();
		char ch1[]=s2.toCharArray();
		char ch2[]=new char[6];
		int k=0;
		for(int i=0;i<6;i++)
		{
			System.out.print(ch.length+ch1.length);
			if(i%2==0)
			{
			 ch2[k]=ch1[i];
			 k++;
			}
			else if(i%2==1)
			{
				ch2[k]=ch[i];
				k++;
			}
	}
	System.out.println(new String(ch2));
}
}
	
class Test2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println("Enter String");
		String s2=sc.nextLine();
		TestApp1 t=new TestApp1();
		t.setValue(s,s2);
		t.result();
	}
}

		
			