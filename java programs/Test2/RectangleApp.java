class Rectangle
{
	private int len;
	private int breadth;
	Rectangle()
	{
		this.len=0;
		this.breadth=0;
	}
	Rectangle(int len,int breadth)
	{
		this.len=len;
		this.breadth=breadth;
	}
	Rectangle(int side)
	{
		this.len=side;
		this.breadth=side;
	}
	public int calculate()
	{
		return len*breadth;
	}
}
public class RectangleApp {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		System.out.println("The First"+r1.calculate());
		Rectangle r2=new Rectangle(2,3);
		System.out.println("The First"+r2.calculate());
		Rectangle r3=new Rectangle(5);
		System.out.println("The First"+r3.calculate());

	}

}
