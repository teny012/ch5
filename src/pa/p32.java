package pa;

public class p32
{

	public static void main(String[] args)throws CarException
	{
		Car1 car1 = new Car1();
		car1.setCar(1234,-10.0);
		car1.show();
	}
}
class CarException extends Exception{
	
}
class Car1
{
	protected int num;
	protected double gas;
	
	public Car1()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g)
	{
		if(g<0)
		{
			CarException e = new CarException();
			throw e;
		}else
		{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
		}
	}
		
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}