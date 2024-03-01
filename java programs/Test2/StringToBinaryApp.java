
import java.util.Scanner;
interface Con
{
	void perOpe();
}
class StringToBinary
{
	String str;
	public void setString(String str)
	{
		this.str=str;
	}
	public void perOpe()
	{
		char ch[]=str.toCharArray();
		
		int a[]=new int[8];
		for(int i=0;i<ch.length;i++)
		{
			int c=(int)str.charAt(i);
			for(int j=7;j>=0;j--)
			{
				a[j] = c%2;//1//0//0/0/0/0/1/0
                c = c / 2;	
			}
			for(int aa:a)
			{
				 System.out.print(aa);
			}
			//System.out.println(" ");
		}
	}
}
public class StringToBinaryApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		StringToBinary s1=new StringToBinary();
		s1.setString(s);
		s1.perOpe();
	}

}
