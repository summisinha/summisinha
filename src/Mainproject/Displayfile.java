package Mainproject;
import java.io.File;
import java.io.IOException;

public class Displayfile {
public static void main(String[] args) throws IOException {
String path="D:\\";
File f=new File(path);
File filename[]=f.listFiles();
for(File ff:filename) {
	System.out.println(ff.getName());
}
}
}

