import java.util.Scanner;
class Product{
   private int id;
   private String name;
   private int price;
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
    public void setPrice(int price)
   {
	   this.price=price;
   }
   public int getPrice()
   {
	   return price;
   }
}
class ProductRec{
	private Product p[];
	private int i;
	private boolean flag=false;
	public void Setdata(Product a[])
	{
		p=a;
	}
    Product getresult(int id)
	{
		for(int i=0;i<p.length;i++)
		{
			if(p[i].getId()==id)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			return p[i];
		}
		else
		{
			return null;
		}
	}
}
public class ProductInfo{
	public static void main(String aaa[])
	{
		Scanner sc=new Scanner(System.in);
		ProductRec p1=new ProductRec();//second class object
		Product p2[]=new Product[2];//pojo class ref;
		for(int i=0;i<p2.length;i++)
		{
			System.out.println("Enter a name id price");
			String name=sc.nextLine();
			int id=sc.nextInt();
			int price=sc.nextInt();
			sc.nextLine();
			p2[i]=new Product();
			p2[i].setName(name);
			p2[i].setId(id);
			p2[i].setPrice(price);
		}
		p1.Setdata(p2);
		System.out.println("Enter id for search");
		int sid=sc.nextInt();
		Product res=p1.getresult(sid);//return type should be created pojo class
		if(res!=null)
		{
			System.out.println(res.getName()+"\t"+res.getId()+"\t"+res.getPrice());
		}
		else{
			System.out.println("There is no record found");
		}
	}
}
			
		