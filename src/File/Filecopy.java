package File;
import java.io.*;
import java.util.Scanner;

public class Filecopy {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Read input file name: ");
	String ip=sc.nextLine();
	ip="E:\\java\\"+ip;
	FileReader in;
	
	try {
		File fin=new File(ip);
		in=new FileReader(fin);
	}
	catch(Exception e) {
		System.out.println("File not found");
	    return;
	}
	System.out.println("Enter output file name : ");
	String op=sc.nextLine();
	op="E:\\java\\"+op;
	FileWriter out;
	try {
		File fout=new File(op);
		out=new FileWriter(fout);
	}
	catch(Exception e){
		System.out.println("File not found");
		return;
	
	}
	int c;
	while((c=in.read())!=-1) {
		out.write(c);
	}
	System.out.println("File copied");
	in.close();
	out.close();
	
}
}


