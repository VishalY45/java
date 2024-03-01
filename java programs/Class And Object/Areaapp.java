import java.util.Scanner;
class Circkle{
	float radious;
	void setradious(float r)
	{
		radious=r;
	}
	void showarea()
	{
		float p=3.14f;
		float a=p*radious*radious;
		System.out.printf("Radious is %f",a);
	}
}
	public class Areaapp{
	public static void main(String s[])
	{
		Scanner sc= new Scanner (System.in);
		float r;
		System.out.printf("Enter radious");
		r=sc.nextInt();
		Circkle c1=new Circkle();
		c1.setradious(r);
		c1.showarea();
	}
}