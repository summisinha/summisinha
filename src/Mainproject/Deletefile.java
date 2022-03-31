package Mainproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Deletefile{
public static void main(String[] args) throws IOException {
String path="D:\\";
Scanner sc=new Scanner(System.in);
System.out.println("enter the file name to be deleted");
String filname=sc.next();
String finalfile=path+filname;
File file=new File(finalfile);
file.delete();
System.out.println("file deleted");

}
}


