
public class Car {
	int topSpeed = 150;
	void show()
	{
		System.out.println("Car CLass Function");
	}
}
class myCar extends Car{
	int topSpeed = 250;
	
	void show()
	{
		System.out.println("Top Speed = "+super.topSpeed);
	}
	
	void display()
	{
//		@Override
		show();
//		super.show();
		
	}
}
