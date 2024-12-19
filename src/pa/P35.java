package pa;
import java.io.*;
public class P35 {

	public static void main(String[] args) {
		
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("hello");
			pw.println("goodbye!");
			pw.close();
			System.out.println("資料已經寫入檔案了");
		}
		catch(IOException e) {
			System.out.println("輸入輸出有誤");
		}
	}
}
