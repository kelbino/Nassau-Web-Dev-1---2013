
public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount johnAcct = new BankAccount( "98765", 50.00 );
		BankAccount kelvinAcct = new BankAccount( "76548", 500.00 );
		BankAccount salimAcct = new BankAccount( "19287", 1000.67);
		
		System.out.println( johnAcct );
		System.out.println( salimAcct );
		
		johnAcct.deposit( 30.97 );
		System.out.println( "After Deposit\n" + johnAcct );
		
		if( kelvinAcct.withdraw( 700.00 ) == true ) {
			
			System.out.println( "Successful!!!\n" + kelvinAcct );
			
		}
		else {
			
			System.out.println( "Insuffient Funds" );
		}
	
	
	
	//let's deposit into kelvin acct
	kelvinAcct.deposit( 50000000.03 );
	System.out.println( "After deposit\n" + kelvinAcct );

	BankAccount jaredAcct = new BankAccount( "11111", 850.87 );
	System.out.println( jaredAcct );
	
	
	System.out.println( " Jared has a a balance of " + jaredAcct.getBalance() );
	
	
	
	
	}
}
