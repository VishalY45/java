/*: WAP to create class name as Voter as POJO class with field id name and age and we have one more class name as VoterChecker with two methods 
void setVoters(Voter v[]): this method can accept array of object as parameter
Voter getVoter(): this method can return voter details whose age is greater than 18
*/
import java.util.Scanner;
class Voter
{   private int id;
    private String name;
    private int age;
    public void setId(int id)
    { this.id=id;
    }
    public int getId(){
      return id;
    }
    public void setName(String name)
    { this.name=name;
    }
    public String getName(){
       return name;
    }
    public void setAge(int age)
    { this.age=age;
    }
    public int getAge(){
      return age;
    }
}
class VoterCheck{
	private Voter v[];
	private int i;
	private boolean flag=false;
	public void setData(Voter a[])
	{
		v=a;
	}
    Voter getVoter(int index,int age)
	{ 
			if(v[index].getAge()>=age)
			{
				flag=true;
			}
		if(flag)
		{
			return v[index];
		}
		else
		{
			return null;
		}
    }
}
public class VoterRecord{
public static void main(String x[])
{
  Scanner sc=new Scanner(System.in);
  VoterCheck v1=new VoterCheck();
  Voter v2[]=new Voter[2];
  for(int i=0;i<v2.length;i++)
  {
	  System.out.println("Enter name id age");
	  String name=sc.nextLine();
	  int id=sc.nextInt();
	  int age=sc.nextInt();
	  sc.nextLine();
	  v2[i]=new Voter();
	  v2[i].setName(name);
	  v2[i].setId(id);
	  v2[i].setAge(age);
  }
   System.out.println("The Eligible For VOte List Is.....");
   v1.setData(v2);
   //Voter v3=new Voter();
   for(int i=0;i<v2.length;i++)
   {
   Voter res=v1.getVoter(i,18);
   if(res!=null)
   {
	   System.out.println(res.getName()+"\t"+res.getId()+"\t"+res.getAge());
   }
   }
}
}

	  
	  
	