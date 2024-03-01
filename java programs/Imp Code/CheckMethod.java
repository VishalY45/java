package Concept.org;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Method;
import java.util.*;
class studentt{
	private String name;
	private int id;
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
}
public class CheckMethod {

	public static void main(String[] args)throws Exception {
		
		Class c1=Class.forName("Concept.org.studentt");
		Method[] m=c1.getDeclaredMethods();
		for(Method m1:m)
		{
			System.out.println(m1);
		}
		Field []f=c1.getDeclaredFields();
		for(Field f1:f)
		{
			System.out.println(f1);
		}
		

	}

}
