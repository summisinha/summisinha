package project2;
//super keyword before a variable
class Bike{
	int speed=200;
}
class R15 extends Bike{
	int speed=100;
	void speedR15() {
		System.out.println(speed+150);
	}
}

class YamahanewR15 extends Bike{
	//speed=200
	
	int speed=300;
	void newspeed() {
		System.out.println(super.speed+200);
	}
}
public class InheritenceEx {
	public static void main(String[] args) {
		YamahanewR15 r15=new YamahanewR15();
		r15.newspeed();
	}

}


