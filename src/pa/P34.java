package pa;
import java.io.*;
public class P34 {

	public static void main(String[] args) {
		System.out.println("請輸入字串");
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
			System.out.println("以輸入字串"+str);
		}
		catch(IOException e) {
			System.out.println("輸入輸出有誤");
		}
	}
}
