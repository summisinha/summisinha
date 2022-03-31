package File;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("a.txt");
	if(fos!=null) {
		System.out.println("file created an opened in write mode");
	}
	String input="hi how are u";
	byte b[]=input.getBytes();
	fos.write(b);
	System.out.println("write operation completed");
	fos.close();
	
}
}




