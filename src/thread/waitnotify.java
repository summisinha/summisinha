package thread;
class ATMcustomer{
	int balance=100000;
	
synchronized void withdraw(int amount)  {
		System.out.println("withdrawl started ");
		if(balance<amount) {
			System.out.println("less balnce ; waiting for deposit to happen");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			balance-=amount;
			System.out.println("withdrawl is completed"+balance);

	}
	
synchronized void deposit(int amount) {
		System.out.println("deposit is processed");
		balance+=amount;
		System.out.println("deposit is completed");
		notify();
	}
	
	
	
	
}
public class waitnotify {
	public static void main(String[] args) {
		
		    ATMcustomer cu=new ATMcustomer();
		    new Thread() {   

		    	public void run() {
		    			cu.withdraw(115000);
		    	}              


		    }.start();

		    
		    
		    new Thread() {   

		    	public void run() {
		    		cu.deposit(40000);
		    	}              


		    }.start();
		
	}

}

