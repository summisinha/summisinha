package File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class read {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("a.txt");
	if(fis!=null) {
		System.out.println("file is in read mode");
	}
	int i=0;
	//EOF (-1)
	while((i=fis.read())!=-1) {
		System.out.print((char)i);
	}
	System.out.println();
	System.out.println("read operation completed");
	fis.close();
	
}
}

