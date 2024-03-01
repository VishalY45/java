
import java.util.*;
class NoConversion
{
	private int Dno;
	private int Bno[];
	public NoConversion(int no)
	{
		this.Dno=no;
		int temp=Dno;
		int a[]=new int[8];
		int i=0;
		    while (Dno > 0) {
		        int rem = Dno % 2;
		        a[i] = rem;
		        i++;
		        Dno = Dno / 2;
		    }
			
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
		no=temp;
	}
	public NoConversion(int Bno[],int size)
	{
		this.Bno=new int[size];
		//int k=1;
		int sum=0;
		for(int i=size-1;i>=0;i--)//0111
		{
			System.out.println(Bno[i]);

			if(Bno[i]==1)
			{
				 int power = 1;
		            for (int j = 0; j < size - 1 - i; j++) {
		                power *= 2;
		            }
		            sum += power;
			}
		}
		System.out.println("Decimal No :"+sum);
		
	}
	
}
class DecimalToBinaryApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal No");
		int no=sc.nextInt();
		NoConversion n1=new NoConversion(no);
		System.out.println();
		System.out.println("Enter Binary No and size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		NoConversion n2=new NoConversion(a,size);

	}

}
