package practicecode;
class animal
{
	void makeSound()
	{
		 System.out.println("Animal makes a sound");
	}
}
class dog extends animal
{
	@Override
	void makeSound()
	{
        System.out.println("Dog barks");
    }
}
class cat extends animal
{
	@Override
	void makeSound() 
	{
        System.out.println("Cat meows");
    }

}
class bird extends animal
{
	@Override
	void makeSound()
	{
        System.out.println("Birds chirps");
    }

}

public class dynamicmethodclass 
{
	public static void main(String[] args) 
	{
		animal a1=new dog();
		animal a2=new cat();
		animal a3=new bird();
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();

	}

}
