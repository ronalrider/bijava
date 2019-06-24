public class Dog
{
	String name;
	int age;
	void Eat()
	{
		System.out.println("Dog is eating his food");
	}
	public static void main(String s[])
	{
		Dog d1=new Dog();
		Dog d2=new Dog();
		Dog d3=new Dog();
		d1.Eat();
		d1.Eat();
		d1.Eat();
	}
}