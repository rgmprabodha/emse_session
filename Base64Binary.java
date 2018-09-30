package ecms;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

public class Base64Binary {

	public static void main(String[] args) {
		File file = null;
        FileInputStream fis;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();		 
        byte[] buf = new byte[1024];
        
		file = new File("D:\\rose.jpg");	
		
		try {
			fis = new FileInputStream(file);
            try {
				for (int readNum; (readNum = fis.read(buf)) != -1;) {
				    bos.write(buf, 0, readNum); 
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
        byte[] bytes = bos.toByteArray();
		String string = Base64.getEncoder().encodeToString(bytes);

		System.out.print(string);
	}

}
