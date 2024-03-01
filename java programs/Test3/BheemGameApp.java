/*
Write a program to develop a game to play between "Chota Bheem" from Dholakpur and user.
your program should ensure that the "Chota Bheem" always wins the game because "Laddu" is 
favorite of "Chota Bheem".
Rules for the game:-
 i) There are 21 Laddu's in plate.
ii) User can pick 1 to 4 Laddu's (user and "chota Bheem" should pick Laddu's less than 5) 
iii) After the user picks Laddu's , "Chota Bheem" does its picking.
iv) whoever is forced to pick up the last Laddu, loses the game.
*/
import java.util.*;
class BheemGame
{
		int userPickM(int reamning)
	{
		 int count;
	  do{
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter laddu count");
	   	   count=sc.nextInt();
	  }while(count<1||count>4||count>reamning);
	  return count;
	}
	 int bheempick(int reamning)
	{
		int bheempicka=(reamning%5==0)?4:reamning%5;
		return bheempicka;
	}
}
class BheemGameApp
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner (System.in);
		BheemGame b1=new BheemGame();
		int ladduonplate=21;
		while(true)
		{
			int userpick=b1.userPickM(ladduonplate);
			ladduonplate -=userpick;
			if(ladduonplate==0)
			{
				System.out.println("Congraulation you Pick last Laddu");
				break;
			}
			int bheempicks=b1.bheempick( ladduonplate);
			ladduonplate -=bheempicks;
			System.out.println("Bheem Pick :"+bheempicks+"laddu");
			if(ladduonplate==0)
			{
				System.out.println("Congraulation Bheem Pick last Laddu");
				break;
			}
			  System.out.println("Laddus remaining on the plate: " +ladduonplate);
		}
	}

}
