package pa;

public class p46 {

	public static void main(String[] args) {
		bar1 car1 = new bar1("1號車");
		car1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class bar1 extends Thread
{
	private String name;
	
	public bar1(String nm)
	{
		name = nm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				sleep(1000);
				System.out.println("正在進行"+name+"的處理工作");
			}
			catch(InterruptedException e) {
		}
	}
	}
}
