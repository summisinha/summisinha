package Mainproject;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Searchfile {
public static void main(String[] args) throws IOException {
String path="D:\\";
File f=new File(path);
Scanner sc=new Scanner(System.in);
System.out.println("enter the file name to search");
String filsearchname=sc.next();
File filename[]=f.listFiles();
int flag=0;
for(File ff:filename) {
	if(ff.getName().equals(filsearchname)) {
		flag=1;
		break;
	}
	else {
		flag=0;
	}
	
	
	
}

if(flag==1) {
	System.out.println("found the file");
}
else {
	System.out.println("file is not found");
}
}
}


