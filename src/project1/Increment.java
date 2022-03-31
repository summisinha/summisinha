package project1;
class Incrementor{
	static int counter=0;
	Incrementor() {
		counter++;
		System.out.println(counter);
	}

	
}


public class Increment {
	public static void main(String[] args) {
		Incrementor i=new Incrementor();
		Incrementor i1=new Incrementor();
		Incrementor i2=new Incrementor();


	}


}
