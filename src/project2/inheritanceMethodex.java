package project2;
class Bike{
	int speed=200;
}
class R15 extends Bike{
	int speed=100;
	
	void speedR15() {
		System.out.println(speed+150);
	}
	
	R15(){
		System.out.println("this is r15 bike");
	}
}

class YamahanewR15 extends R15{
	//speed=200
	
	int speed=300;
	
	void speedR15() {
		super.speedR15();
		System.out.println(speed+200);
	}
	
	public YamahanewR15() {
		// TODO Auto-generated constructor stub
	System.out.println("yamahar15 new");
	}
}
public class inheritanceMethodex {
	public static void main(String[] args) {
		YamahanewR15 r15=new YamahanewR15();
		//r15.speedR15();
	}

}




