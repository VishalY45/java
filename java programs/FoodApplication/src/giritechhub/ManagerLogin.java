package giritechhub;
import java.util.*;
public class ManagerLogin {
	Scanner scanner = new Scanner(System.in);
    int  id,choice;
    ArrayList<FoodItem> FI =new ArrayList<>();
public void mManagerLogin() {
	System.out.println("Enter your Choice");
	choice =scanner.nextInt();
	
	/*--------------Switch case For Manager------------------*/
	switch(choice)
	{
	case 1:
		Manager manager =new Manager();
		System.out.println("Enter Manager Username");
		String Username=scanner.next();
		System.out.println("Enter Manager Password");
		String Password=scanner.next();
		if (Username.equals("manager") && Password.equals("12345")) 
		{
			
			
			int cmanager;
			do {
				System.out.println("1.Add Food Item");
				System.out.println("2.Display All Food Item");
				System.out.println("3.Update Food Item");
				System.out.println("4.Delete Food Item");
				System.out.println("5.Display Total sales");
				System.out.println("6.Display All Customer Deatails");
				System.out.println("Enter your Choice");
				 cmanager = scanner.nextInt();
				switch ( cmanager)
				{

				case 1:
					FoodItem foodItem = new FoodItem();
					System.out.println("Enter Id");
					foodItem.setId(scanner.nextInt());
					
					System.out.println("Enter Food Name");
					scanner.nextLine();
					foodItem.setName(scanner.nextLine());
					
					System.out.println("Enter Food Price");
		            foodItem.setPrice(scanner.nextDouble());
		            scanner.nextLine();
		            
					System.out.println("Enter food Item Category");
					foodItem.setCategory(scanner.nextLine());
					
					System.out.println("Enter Food Item Description");
					foodItem.setDescripition(scanner.nextLine());
					
					
					
//					System.out.println("Food Id:" +foodItem.getId());
//					System.out.println("Food Name :"+foodItem.getName());
//					System.out.println("Food Price :"+foodItem.getPrice());
//					System.out.println("food Category :"+foodItem.getCategory());
//					System.out.println("Food Descripition :"+foodItem.getDescripition());
					FI.add(foodItem);
					System.out.println("Food Add Successfully-----------!!!");
					
					
					break;
				case 2:
					System.out.println();
					System.out.printf("ID"+"\t"+"Name"+"\t"+"Price"+"\t"+"Category"+"\t"+"Descripition");
					System.out.println();
					
					for(FoodItem i :FI)
					{
						System.out.printf(i.getId()+ "\t" +i.getName()+ "\t" +i.getPrice()+ "\t"+i.getCategory()+ "\t"+i.getDescripition());
						
						System.out.println();
					}
					break;
				case 3:
					
					System.out.println("Enter Id");
					id=scanner.nextInt();
					boolean flag =false;
					for(FoodItem i :FI)
					{
						if(id==i.getId())
						{
							
							System.out.println("1.Name");
							System.out.println("2.Price");
							System.out.println("3.Category");
							System.out.println("4.Descripition");
							
							System.out.println("Enter Your Choice");
							int choiceu =scanner.nextInt();
					
							switch( choiceu)
							{
							case 1:
								System.out.println("Enter Name");
								scanner.nextLine();
								i.setName(scanner.nextLine());
								flag=true;
								System.out.println("Name Update SuccessFully-----------!!!");
								break;
							case 2:
								System.out.println("Enter Price");
								
								i.setPrice(scanner.nextDouble());
								flag=true;
								System.out.println("Name Price SuccessFully-----------!!!");
								break;
							case 3:
								System.out.println("Enter Category");
								scanner.nextLine();
								i.setDescripition(scanner.nextLine());
								flag=true;
								System.out.println("Name Update Category-----------!!!");
								break;
							case 4:
								System.out.println("Enter Descripition");
								scanner.nextLine();
								i.setDescripition(scanner.nextLine());
								flag=true;
								System.out.println("Name Update Descripition-----------!!!");
								break;
					
							default:
								System.out.println("Worng Choice");
								
							
							}
							
							
						}
						
					}
					break;
				case 4:
					System.out.println("Enter Your Id For Remove");
					id =scanner.nextInt();
					
					for(int i=0;i<FI.size();i++)
					{
						FoodItem f = FI.get(i);
						if(id==f.getId())
						{
							Object b= FI.remove(i);
							if(b!=null)
							{
								System.out.println("Data Removed..........");
							}
							else
							{
								System.out.println("Data Not Removed..........");
							}
							
						}
					}
					break;
				case 5:
					break;
				case 6:
					break;
//				case 7:
//					System.out.println("Exit Manager");
//					System.exit(0);
//					break;
			default:
				System.out.println("Invalid Choice");
				}

			}while (cmanager<7);

		}
		else
		{
			System.out.println("Invalid Manager");
		}
		break;
}
}
public void customerLogin()
{
//	Scanner scanner = new Scanner(System.in);
//    int  id,choice;
//    ArrayList<FoodItem> FI =new ArrayList<>();

Customer customer =new Customer();
System.out.println("Enter Customer Username");
String costoUsername=scanner.next();
System.out.println("Enter Customer Password");
String costoPassword=scanner.next();
if(costoUsername.equals("customer") && costoPassword.equals("12345"))
  {
	int  ccustomer ;
	do {
		System.out.println("1.Display All food Items Details");
		System.out.println("2.Purchase Food Item");
		System.out.println("3.Display Total Bill");
		System.out.println("4.Search Food Item Between Price Range");
		System.out.println("5.Search Food Item by Categray");
		System.out.println("Enter your choice");
		  ccustomer = scanner.nextInt();
		switch(ccustomer)
		{
		case 1:
			System.out.println("Display All food Items Details");
			System.out.println("ID\tName\tPrice\tCategory\tDescripition");
			for(Object obj:FI)
			{
				FoodItem item = (FoodItem)obj;
				System.out.printf("%d\t%s\t%.2f\t%s\t%s\n",
						item.getId(),
						item.getName(),
						item.getPrice(),
						item.getCategory(),
						item.getDescripition());
			}
			break;
		case 2:
			System.out.println("-----------Purchase Food-----------");
			System.out.println("Enter the name and qty:");
			String fName=scanner.next();
			int fQty=scanner.nextInt();
			double rate=0,index=0;
			for(int i=0;i<FI.size();i++)
			{
				
					Object fn = (FoodItem) FI.get(i);
				
					FoodItem f  = (FoodItem)fn;
					if(f.getName().equals(fName))
					{
						rate = f.getPrice();
	
						index=i;
						int total = (int) (rate*fQty);
						System.out.println("id:"+f.getId()+"\t"+f.getName()+"\t"+f.getPrice()+"\t"+fQty+"\t"+total);
						break;
					}	
			}
			
			
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
//		case 6:
//			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
	}while( ccustomer <6);
	
}
else
{
	System.out.println("Invalid custo");
}



}
}

