package arrayKaryawan;
import java.io.*;

// membaca string dan integer
public class myInput {
	public String bacaString(){
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in),1);
		String string =" ";
		try {
			string=bfr.readLine();
		} catch (IOException ex) {
			System.out.println(ex);
		}
		return string;
	}
	public int bacaInt(){
		return Integer.parseInt(bacaString());
	}

}
