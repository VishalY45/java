package giritechhub;

import java.util.ArrayList;
import java.util.Scanner;


	public class RestaurtantManagementSystemApp {

		private static final FoodItem[] FI = null;

		public static void main(String[] args) {
			ArrayList<Manager> al1 = new ArrayList<>();
			
			ArrayList<Customer> al2 = new ArrayList<>();
			
	      //  ArrayList<FoodItem> FI =new ArrayList<>();
			int  id;
			Scanner scanner = new Scanner(System.in);
			
		int choice;
		/*--------------Main Switch case For Customer & manager------------------*/
	       do {
	    	   System.out.println("--------Welcome Restautant Management--------");
				/*System.out.println("Manager Login Username-manager --  password-12345");
				System.out.println("Customer Login Username-customer --  password-12345");*/
				
				System.out.println("1.Manager");
				System.out.println("2.Customer");
				System.out.println("Enter your Choice");
				choice =scanner.nextInt();
				switch(choice)
				{
				case 1:
					ManagerLogin ml=new ManagerLogin();
					ml.mManagerLogin();
					break;
					
				case 2:
					ManagerLogin ml1=new ManagerLogin();
                    ml1.customerLogin();
					break;
				} 
		
		}while(choice<3);

	}// main class
		


}
