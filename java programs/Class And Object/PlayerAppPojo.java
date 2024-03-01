import java.util.*;
class Player
{   private int id;
    private String name;
    private int run;
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
    public void setRun(int run)
    { this.run=run;
    }
    public int getRun(){
      return run;
    }
}
public class PlayerAppPojo
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
      System.out.println("Enter name id and run of player\n");
      String name=xyz.nextLine();
      int id=xyz.nextInt();
      int run=xyz.nextInt();
      Player p1 =new Player();
	p1.setId(id);
	p1.setName(name);
	p1.setRun(run);
System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getRun());
   }
}
