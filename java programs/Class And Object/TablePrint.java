/*WAP to Create class name as Table with two functions 
void setValue(int x): this function is used for accept integer parameter
void showTables(): this function can display of number.
*/
import java .util.Scanner;
class Table{
	private int no;
	//public:
	void setvalue(int no)
	{
		this.no=no;
	}
	void showTable()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("\n"+no*i);
		}
	}
}
public class TablePrint{
	public static void main(String a[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		Table T1=new Table();
		T1.setvalue(no);
		T1.showTable();
	}
}