import java.util.Scanner;
class Player{
	private int id;
	private String name;
	private int run;
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
	
	public void setRun(int run)
	{
		this.run=run;
	}
	public int getRun()
	{
		return run;
	}
}
public class PlayerIdSearchApp{
	public static void main(String aa[])
	{
		Player p[]=new Player[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<p.length;i++)
		{
			System.out.printf("Enter id name and runs");
			String name=sc.nextLine();
			int id=sc.nextInt();
			
			int run=sc.nextInt();
			p[i]=new Player();
			p[i].setName(name);
			sc.nextLine();
			p[i].setId(id);
			
			p[i].setRun(run);
		}
		System.out.printf("\nDisplay Record\n");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRun());
		}
		System.out.printf("Enter a FInd Element");
		int fno=sc.nextInt();
		boolean flag=false;
		int i=0;
		for( i=0;i<p.length;i++)
		{
			if(p[i].getId()==fno)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRun());
			System.out.println("There Is  Player Found");
		}
		else
		{
			System.out.println("There Is No Player");
		}
	}
}
	