import java.util.Scanner;
class Employee{
	int id;
	int sal;
	String name;
	void setperinfo(String name2,int id,int sal)
	{
		name=name2;
		this.id=id;
		this.sal=sal;
	}
	void setprogress(int pro)
	{
		if(pro>=60)
		{
			int sal2=(sal*30)/100;
			sal=sal2+sal;
		}
	}
	void show()
	{
		System.out.printf("Name=%s\t id=%d \t sal=%d ",name,id,sal);
	}
}
public class EmployeeProgresSal
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int id;
		int sal;
		String name;
		System.out.printf("\nEnter name id sal\n");
		name=sc.nextLine();
		id=sc.nextInt();
		sal=sc.nextInt();
		Employee emp=new Employee();
		emp.setperinfo(name,id,sal);
		emp.show();
		
		System.out.printf("\nENter a progress\n");
		int proo=sc.nextInt();
		emp.setprogress(proo);
		emp.show();
	}
}
		
		
		
			
			