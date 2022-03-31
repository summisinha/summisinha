package File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopy1 {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("a.txt");
	FileOutputStream fos=new FileOutputStream("b.txt");
	int i=0;
	//EOF (-1)
	while((i=fis.read())!=-1) {
		fos.write(i);
	}
	System.out.println();
	System.out.println("copy completed");
	fis.close();
	
}
}


  