package practicecode;
abstract class car
{
	int regno;
	car(int r)
	{
		regno=r;
	}
	void opentank()
	{
		System.out.println("Fill the tank");
	}
	abstract void steering(int direction,int angle);
	abstract  void braking(int force);
}
class santro extends car
{
	santro(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This car uses ordinary steering");
	}
	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("This car uses hydraulic brakes");
	}
}
class maruti extends car
{
	maruti(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This car uses power steering");
	}
	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("This car uses gas brakes");
	}
}

public class abstract_cars 
{

	public static void main(String[] args)
	{
	  maruti m=new maruti(1001);
	  santro s=new santro(5005);
	  car ref;
	  ref=m;
	  ref.opentank();
	  ref.steering(1, 90);
	  ref.braking(500);
	  ref=s;
	  ref.opentank();
	  ref.steering(4, 45);
	  ref.braking(800);
	}
}
