package pa;

public class p50 {

	public static void main(String[] args) {
		bar4 car1 = new bar4("1號車");
		Thread th1 = new Thread(car1);
		th1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class bar4 implements Runnable
{
	private String name;
	
	public bar4(String nm)
	{
		name = nm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行"+name+"的處理工作");
			
	}
	}
}
