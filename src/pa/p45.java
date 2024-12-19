package pa;

public class p45 {

	public static void main(String[] args) {
		bar car1 = new bar("1號車");
		car1.start();
		bar car2 = new bar("2號車");
		car2.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class bar extends Thread
{
	private String name;
	
	public bar(String nm)
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
