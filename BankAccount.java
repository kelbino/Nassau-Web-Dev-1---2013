
public class BankAccount {

	//declare instance variables
	
	private String acctnum;
	private double balance;
	
	//get you ( getter) methods
	public String getAcctNum() {
		
		return acctnum;
		
	}
	
	
	public double getBalance() {
		
		return balance;
		
		
	}
	
	//constructor methods
	public BankAccount( String a, double b ) { //opens constructor method
	
	
	acctnum = a;
	balance = b;

		
	}//closes constructor method
	
	public BankAccount() {
		
		acctnum = "00000";
		balance = 0.0;
		
		
	}
	
	
	//instance methods
	
	public void deposit( double depamt) {
		
		balance += depamt;
		
	}
	
	public boolean withdraw( double withamt ) {
		
		if( withamt <= balance ) {
			balance -= withamt;
		
			return true;

		}
		else {
		
			return false;
			
		}
		
	}
		
	public String toString() {
		
		return "Account # " + acctnum + " has a balance of $" + balance;
	}
			
			
	
	
	
	
	
	
}// closes class
