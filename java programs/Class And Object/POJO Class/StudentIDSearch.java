import java.util.Scanner;
class Student{
	private int id;
	private String name;
	private int marks;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}
}
public class StudentIDSearch{
	public static void main(String aa[])
	{
		Scanner sc=new Scanner (System.in);
		Student s1[]=new Student[2];
		for(int i=0;i<s1.length;i++)
		{
			System.out.printf("Enter a name id and marks\n");
			String name=sc.nextLine();
			sc.nextLine();
			int id=sc.nextInt();
			int marks=sc.nextInt();
			s1[i]=new Student();
			s1[i].setName(name);
			s1[i].setId(id);
			s1[i].setMarks(marks);
		}
		int i=0;
		System.out.printf("\nDisplay Record\n");
		for( i=0;i<s1.length;i++)
		{
			System.out.println(s1[i].getName()+"\t"+s1[i].getId()+"\t"+s1[i].getMarks());
		}
		System.out.printf("Enter a search Id");
		int sid=sc.nextInt();
		boolean flag=false;
		for( i=0;i<s1.length;i++)
		{
			if(s1[i].getId()==sid)
			{
				flag=true;
				break;
			}
		}
		if(flag=true)
		{
		  System.out.println(s1[i].getName()+"\t"+s1[i].getId()+"\t"+s1[i].getMarks());
		}
           else
		   {
             System.out.printf("ID Not Found");
		   }
	}
}	
			