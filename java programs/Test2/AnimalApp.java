abstract class Animal
{
	abstract void eat();
	abstract void sleep();
}
class dog extends Animal
{
	public void eat()
	{
		System.out.println("dog eat chickan");
	}
	public void sleep()
	{
		System.out.println("dog Sleep");
	}
	public void bark()
	{
	}
	public void breed()
	{
	}
}
	
class AnimalApp{
	 public static void main(String args[])
	 {
		 dog d1=new dog();
		 d1.eat();
		 d1.sleep();
		 d1.bark();
		 d1.breed();
	 }
}