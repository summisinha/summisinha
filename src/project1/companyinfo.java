package project1;
public class companyinfo {
    int id;
    String name;
    String comapanyNameString="Mphasis";
    
    public companyinfo(int id, String name) {
    
        this.id = id;
        this.name = name;
    }
    public void change() {
        this.comapanyNameString="Wipro";
    }
    public static void main(String[] args) {
        companyinfo c1=new companyinfo(1001, "summi");
        c1.change();
        System.out.println("Name is "+c1.name+" Id is "+c1.id+" Company name is "+c1.comapanyNameString);
        System.out.println();
        companyinfo c2=new companyinfo(1002, "Sunirmal");
        c2.change();
        System.out.println("Name is "+c2.name+" Id is "+c2.id+" Company name is "+c2.comapanyNameString);
        System.out.println();
        
        companyinfo c3=new companyinfo(1003, "Subhankar");
        c3.change();
        System.out.println("Name is "+c3.name+" Id is "+c3.id+" Company name is "+c3.comapanyNameString);
        System.out.println();
        
    }
    
}

