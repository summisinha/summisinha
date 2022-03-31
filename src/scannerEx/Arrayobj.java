package scannerEx;
import java.util.Arrays;
import java.util.Scanner;
class Student{
	int sid;
	String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
}
public class Arrayobj {
public static void main(String[] args) {

	Student s1=new Student(1,"sudip");
	Student s2=new Student(2, "nitesh");
	Student s3=new Student(3,"prasad");
	Student s[]=new Student[3];
	s[0]=s1;
	s[1]=s2;
	s[2]=s3;
	
	for(Student ss:s) {
		System.out.println(ss);
	}
	
}
}



