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
class ProductRecord{
	private Product[] p1;
	private boolean flag=false;
	public void setvalue(Product...p1)
	{
		this.p1=p1;
	}
	public boolean  getresult(int sid)
	{
		for(int i=0;i<p1.length;i++)
		{
			if(p1[i].getId()==sid)
			{
				flag=true;
				
				break;
			}
		}
		return flag;
	}
	public void show()
	{  System.out.println("Name\tid\tprice");
		for(int i=0;i<p1.length;i++)
		{
			System.out.println(p1[i].getName()+"\t"+p1[i].getId()+"\t"+p1[i].getPrice()+"\n");
		}
	}
}
class ProductDetail
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		//int arr[]=new int[5];
		//System.out.println("Entr a id name and price");
		Product p[]=new Product[2];
		for(int i=0;i<p.length;i++)
		{
			System.out.printf("Enter name id price");
			String name=sc.nextLine();
			int id=sc.nextInt();
			int price=sc.nextInt();
			sc.nextLine();
			p[i]=new Product();
			p[i].setName(name);
			p[i].setId(id);
			p[i].setPrice(price);
		}
		ProductRecord p2=new ProductRecord();
		
		p2.setvalue(p);
		p2.show();
		System.out.println("Enter a search id");
		int sid=sc.nextInt();
		boolean b=p2.getresult(sid);
		if(b)
		{
		System.out.println("Product Is Found");
		}
         else
		{
          System.out.println("Product Is not Found");
		}
	}
}	
			
			
   