import java.util.Scanner;
class Circkle{
	int len,wid;
	void setradious(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
	void showarea()
	{
		int a=len*wid;
		System.out.printf("Area of rectangle is %d",a);
	}
}
	public class AreaappRectangle{
	public static void main(String s[])
	{
		Scanner sc= new Scanner (System.in);
		int len,wid;
		System.out.printf("Enter radious");
		len=sc.nextInt();
		wid=sc.nextInt();
		Circkle c1=new Circkle();
		c1.setradious(len,wid);
		c1.showarea();
	}
}