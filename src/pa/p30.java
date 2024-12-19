package pa;

public class p30
{

	public static void main(String[] args)
	{
		cara car1 = new cara();
		try {
			car1.setCar(1234,-10.0);
		}
		catch(CarException e) {
			System.out.println("拋出"+e+"了");
		}
		car1.show();
	}
}
class CarException extends Exception{
	
}
class cara
{
	protected int num;
	protected double gas;
	
	public cara()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g)throws  CarException
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