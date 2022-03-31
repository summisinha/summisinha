package wrapper;

import java.util.ArrayList;
import java.util.Iterator;
class Employee1{
	int empno;
	String empname;
	public Employee1(int empno, String empname) {
		super();
		this.empno = empno;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee1 [empno=" + empno + ", empname=" + empname + "]";
	}
	
}
public class WrapperEx {
	public static void main(String[] args) {
		
		Employee1 emp1=new Employee1(101, "karthik");
		Employee1 emp2=new Employee1(102, "kk");
		Employee1 emp3=new Employee1(103, "pp");
		//array of objects ->collection
		
		ArrayList<Employee1> al=new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Employee1 e=(Employee1) i.next();//object ref
			System.out.println(e.empname+"  "+e.empno);
		}
		
		
	}

}




