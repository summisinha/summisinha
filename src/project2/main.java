package project2;

class Emp {
	    private int empId;
	    private String name;
	    private double sal;
	    
	    
	    public int getEmpId() {
	        return this.empId;
	    }
	    public void setEmpId(int empId) {
	        this.empId = empId;
	    }
	    public String getName() {
	        return this.name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getSal() {
	        return this.sal;
	    }
	    public void setSal(double sal) {
	        this.sal = sal;
	    }
	    public double incrMentSal() {
	        
	                return this.getSal()+5000;
	    }
	    
	    


		@Override
		public String toString() {
			return "Emp [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
		}




		public class Main {
	    public void main(String[] args) {
	        Emp e1=new Emp();
	        e1.setEmpId(10);
	        e1.setName("summi");
	        e1.setSal(500.25);
	        System.out.println(e1);
	        Emp e2=new Emp();
	        e2.setEmpId(11);
	        e2.setName("summi");
	        e2.setSal(500.25);
	        System.out.println(e2);
	        Emp e3=new Emp();
	        e3.setEmpId(12);
	        e3.setName("summi");
	        e3.setSal(500.25);
	        System.out.println(e3);
	        
	        
	        System.out.println();
	        
	        
	    }
		}
}




