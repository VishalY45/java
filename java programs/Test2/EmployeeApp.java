




import java.util.Scanner;

/*
 * create program to create class POJO class name as Employee with id,name,designation and salary 
with a setter and getter methods,insert 5 records 
and we want to create one more class name as Company with parameterized constructor 
Company(Employee employee) 
here we pass Employee class reference as parameter in Company class constructor and method 
name as sortEmployee() to sort employees in descending order by salary
we have one more method name as void show() using this method we can get employee details and 
display it.
 */
class Employee{
	private int id;
	private int sal;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Company
{
	Employee emp[];
	Company(Employee []emp)
	{
		this.emp=emp;
	}
	void show()
	{
		for(int i=0;i<emp.length-1;i++)
		{
			for(int j=i+1;j<emp.length;j++)
			{
				if(emp[i].getSal()<emp[j].getSal())
				{
					Employee temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		System.out.println("Display Record");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].getName()+"\t"+emp[i].getId()+"\t"+emp[i].getSal());
		}
	}
}
public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp[]=new Employee[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			System.out.println("Enter name id and sal");
			String name=sc.nextLine();
			
			int id=sc.nextInt();
			int sal=sc.nextInt();
			emp[i].setName(name);
			emp[i].setId(id);
			emp[i].setSal(sal);
			sc.nextLine();
		}
		Company c=new Company(emp);
		c.show();
		

	}

}
