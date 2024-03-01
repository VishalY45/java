import java.util.Scanner;
class area{
 float p=3.14f;
 float r;
   area(float r)
   {
   this.r=r;
   }
   void calarea()
   {
     float result=r*r*p;
	 System.out.printf("%f",result);
	 }
}
public class areaapp{
public static void main(String a[])
{
 Scanner sc=new Scanner(System.in);
 System.out.printf("Enter a radious");
 float r=sc.nextFloat();
 area a1=new area(r);
 a1.calarea();
}
}
 
   