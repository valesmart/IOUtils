package t13;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class TestIOItils {

	public static void main(String[] args) {
		
		try {
			
			FileReader in = new FileReader("/dok/1.txt");
			FileWriter out = new FileWriter("/dok/2.txt");
			
			IOUtils ioUtils = new IOUtilsImpl();
			ioUtils.replaceChars(in, out, "3369", "1111");
			
			System.out.println();
			System.out.println();
			
			System.out.println(Arrays.deepToString(ioUtils.findFiles("/dok")));
			
		} catch (Exception e) {e.printStackTrace();}
		
	
	}

}
