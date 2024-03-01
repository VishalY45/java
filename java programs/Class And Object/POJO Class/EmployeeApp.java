//Pojo class so pojo class is class with a setter and getter method is known as beans class
// so stter method is used to store data in object and getter method is used for to retrive data in object
// if we want to write  pojo class the we have standard is declare as priavte and acces it via by public
// function preceding with setter and getter method.
import java.util.Scanner;
class Employee{
      private int id;
	  private int sal;
	  private String name;
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
	  public void setSal(int sal)
	  {
		  this.sal=sal;
	  }
	  public int getSal()
	  {
		  return sal;
	  }
	  
}
public class EmployeeApp
{
	public static void main(String a[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.printf("Enter a id sal name");
	String name=sc.nextLine();
	int id=sc.nextInt();
	int sal=sc.nextInt();
	
	Employee emp=new Employee();
	emp.setName(name);
	emp.setId(id);
	emp.setSal(sal);
	
	System.out.println(emp.getName()+"\t"+emp.getId()+"\t"+emp.getSal());
	
}
}
	
	  