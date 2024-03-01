 import java.util.Scanner;
 abstract class Value{
	 int no;
	 void setvalue(int no)
	 {
		 this.no=no;
	 }
	 abstract void primenoo();
	 abstract void perfactnoo();
	 abstract void ducknoo();
 }
 class Adp extends Value{
	 void primenoo(){}
	  void perfactnoo(){}
	  void ducknoo(){}
 }
 class primeno extends Adp
 {
	 void primenoo()
	 {
	 int f=0;
	 for(int i=2;i<no;i++)
	 {
		 if(no%i==0)
		 {
			 f=1;
			 break;
		 }
	 }
	 if(f==1)
	 {
		 System.out.printf("\nNo is not prime");
	 }
	 else
	 {
		 System.out.printf("\nNo is  prime");
	 }
 }
 }
 class perfactno extends Adp{
	  void perfactnoo()
	  {
	 int f=0,sum=0;
	 for(int i=1;i<no;i++)
	 {
		 if(no%i==0)
		 {
			 sum=sum+i;
		 }
	 }
	 if(sum==no)
	 {
		 System.out.printf("\nNo is perfect");
	 }
	 else
	 {
		 System.out.printf("\nNo is not perfect");
	 }
	  }
 }
 class duckno extends Adp{
	  void ducknoo()
	  {
    int temp=no;
	boolean flag=false;
	while(no!=0)
	{
		int rem=no%10;
		no=no/10;
		if(rem==0)
		{
			flag=true;
			break;
		}
	}
	if(flag==true)
	 {
		 System.out.printf("\nNo is duck");
	 }
	 else
	 {
		 System.out.printf("\nNo is  not duck");
	 }
	  
	  }
	  void show()
	  {
		  System.out.printf("Hi");
	  }
 }
 public class Adapterclass{
	 public static void main(String aa[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.printf("ENter a no");
		 int no=sc.nextInt();
		 Value v1=new primeno();
		 v1.setvalue(no);
		 v1.primenoo();
		 v1=new perfactno();
		 v1.setvalue(no);
		 v1.perfactnoo();
		 v1=new duckno();
		 v1.setvalue(no);
		 v1.ducknoo();
		 v1.show();
	 }
 }
		 
	
	 