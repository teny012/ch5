package pa;

public class p48 {

	public static void main(String[] args) {
		bar3 car1 = new bar3("1號車");
		car1.start();
		
	
			try {
				car1.join();
			}
			catch(InterruptedException e) {
		}
			System.out.println("結束main()的處理工作");
	}
}

class bar3 extends Thread
{
	private String name;
	
	public bar3(String nm)
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
