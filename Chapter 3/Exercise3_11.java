class Account{
	private String name;
	private double balance;
	
	public Account(String name, double balance){
		this.name =  name;
		if (balance > 0.0)
			this.balance = balance;
	}
	
	public void deposit(double depositAmount){
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	String getName(){
		return this.name;
	}
	
	void withdraw (double amt){
		if (amt > this.balance){
			System.out.println("Withdrawal amount exceeded account balance");
			return;
		}
		else{
			balance = balance - amt;
		}
	}
}
	
public class Exercise3_11{
	public static void main (String [] args){
		
	}
}