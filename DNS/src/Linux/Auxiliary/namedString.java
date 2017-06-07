package Linux.Auxiliary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class namedString {

	@Override
	public String toString() {
		 File file = new File("/etc/named1");
	        FileReader reader;
	        String txt=null;
			try {
				reader = new FileReader(file);
				 int fileLen = (int)file.length();
			        char[] chars = new char[fileLen];
			        reader.read(chars);
			        txt = String.valueOf(chars);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return txt;
	}
	
}
