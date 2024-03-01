import java.util.Scanner;

public class StringConApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Double dd=200.4;
		String s=dd.toString();
		System.out.println("Numeric to String :"+s);
		String ss="12345";
		int aa=Integer.parseInt(ss);
		System.out.printf("String To Numeric %d",aa);
	}

}
