package project2;

public class Employees extends person {
	private double Sal;
	private double year;
	private String Nino;
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		this.Sal = Sal;
	}
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
	}
	public String getNino() {
		return Nino;
	}
	public void setNino(String nino) {
		Nino = nino;
	}
	@Override
	public String toString() {
		return "Employees [Sal=" + Sal + ", year=" + year + ", Nino=" + Nino + "]";
	}
	
	

}
class TestEmp{
	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.setSal(5000);
		emp.setYear(2022);
		emp.setNino("jkldf");
		System.out.println(emp);
	}
}
