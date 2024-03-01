
/*
 *  Write a program to do the following.
Create a superclass called Vehicle with properties color, model, year.
Create a subclass called Car that inherits from Vehicle and 
adds a new property called numDoors and a method displayInfo to display all 
the values assigned to the properties.
Create an object of the Car class and call the displayInfo method.
 */
class Vehicle
{
	protected String color;
	protected String model;
	protected int year;
	public Vehicle(String color,String model,int year)
	{
		this.color=color;
		this.model=model;
		this.year=year;
	}
}
class Car extends Vehicle
{
	private int Dno;
	public Car(String color,String model,int year,int Dno)
	{	super(color,model,year);
	this.Dno=Dno;
		
	}
	public void displayInfo()
	{
		System.out.println("Car Color :"+color);
		System.out.println("Car Model :"+model);
		System.out.println("Car Year :"+year);
		System.out.println("Car Dno :"+Dno);
	}
}
public class VehicleApp {

	public static void main(String[] args) {
		Car c1=new Car("Blue", "Sedan", 2022, 4);
		c1.displayInfo();

	}

}
