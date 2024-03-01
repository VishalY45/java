/*
) Write a program to create user defined exception to check quality of steel 
in " Kirloskar Steel Industry " .
They provided some parameters to check steel quality:-
A) Hardness of stee must be less than 50
B) Carbon Content must be less than 0.7
C) Tensile Strength must be greater than 5600
 According to parameters, grades are as follows:-
 i) Grade is 10, if all three conditions are met.
 ii) Grade 9, if condition(A) and (B) are met.
 iii) Grade 8, if conditions(B) and (C) are met.
 iv) Grade 7, if conditions(A) and (C) are met.
 v) Grade 6, if only one condition is met.
vi) Grade 5, None of the conditions are me*/
import java.util.*;
class NoneOfTheConditions extends Exception{
	public NoneOfTheConditions()
	{
		System.out.println("None of the conditions are me");
	}
}
class steel{
	private int steelh;
	private float carbon;
	private int tensile;
	public steel(int steelh,float carbon,int tensile)
	{
		this.steelh=steelh;
		this.carbon=carbon;
		this.tensile=tensile;
	}
	public void check()throws NoneOfTheConditions
	{
		int grade=5;
		if(steelh<50&&carbon<0.7||tensile>5600)
		System.out.println("Grade is 10, if all three conditions are met.");
		else if(steelh<50&&carbon<0.7)
		System.out.println(" Grade 9, if condition(A) and (B) are met.");
		else if(carbon<0.7&&tensile>5600)
		System.out.println(") Grade 8, if conditions(B) and (C) are met");
		else if(steelh<50&&tensile>5600)
		System.out.println("Grade 7, if conditions(A) and (C) are met.");
		else if(steelh<50||carbon<0.7||tensile>5600)
			System.out.println("Grade 6, if only one condition is met");
		else
			throw new NoneOfTheConditions();
	}	
}
class SteelCheckApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try{
		steel s1=new steel(49,0.6f,5800);
		s1.check();
		steel s2=new steel(51,0.8f,580);
		s2.check();
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
		
		