import java.util.Iterator;
import java.util.LinkedList;



public class IteratorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> List=new LinkedList <Integer>();
		List.add(20);
		List.add(30);
		Iterator <Integer> i=List.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}

	}

}