import java.util.Scanner;

public class ConApp {

	public static void main(String[] args) {
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1:for autoboxing");
			System.out.println("2:for autounboxing");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				   char chh='a';
				   Character chh1=chh;
				   System.out.println(chh1);
				   short a=23;
				   Short b=a;
				   System.out.println(b);
				   long aa=12;
				   Long bb=aa;
				   System.out.println(bb);
				   double c=12.3f;
				   Double cc=c;
				   System.out.println(cc);
				   boolean flag=false;
				   Boolean flag2=flag;
				   System.out.println(flag2);
				   byte b1=12;
				   Byte b2=b1;
				   System.out.println(b2);
				   int d=12;
				   Integer dd=d;
				   System.out.println(dd);
				   float f=12.4f;
				   Float ff=f;
				   System.out.println(ff);
				break;
			case 2:
				Character c1='d';
				char c2=c1;
				System.out.println(c2);
				Short sh=12;
				short sh2=sh;
				System.out.println(sh2);
				double d2=23.4f;
				Double d3=d2;
				System.out.println(d3);
				Boolean flag3=false;
				boolean flag4=flag3;
				System.out.println(flag4);
				Byte m=23;
				byte mm=m;
				System.out.println(mm);
				Integer ii=232;
				int iii=ii;
				System.out.println(iii);
				Float s=3.4f;
				float ss=s;
				System.out.println(ss);
				break;	
		}
	}while(true);

}
}
