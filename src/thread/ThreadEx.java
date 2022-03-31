package thread;
class NumIterator extends Thread{
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println(i);
		}
	}
}

public class ThreadEx {
	public static void main(String[] args) {
		
		           //thread obj
		NumIterator num=new NumIterator();
		num.start();
	}

}


