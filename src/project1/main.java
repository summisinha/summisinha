package project1;

class Employee{

int empno;
String empname;
double empsalary;

void incrsalary() {
	System.out.println(empno+" "+empname+" "+ (empsalary+5000));
}

}



public class main {
public static void main(String args[]) {
	Employee e=new Employee();
	e.empno=11;
	e.empname="prasad";
	e.empsalary=5000;
e.incrsalary();
   Employee e1= new Employee();
   e1.empno=12;
   e1.empname="sau";
   e1.empsalary=7000;
   e1.incrsalary();
   Employee e2= new Employee();
   e2.empno=13;
   e2.empname="Ashwin";
   e2.empsalary=8000;
   e2.incrsalary();
   
}
}


