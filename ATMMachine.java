import javax.swing.*;

public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String acct = JOptionPane.showInputDialog( "Enter account number ");
		double startbal = Double.parseDouble( JOptionPane.showInputDialog( "Enter starting balance" ) );
		
		
		//we have user input, let's create the BankAccount object
		BankAccount useracct = new BankAccount( acct, startbal );
		
		char userchoice = showMenu( );
		
		while( userchoice != 'q' ) {
			// handle the user's input
			if( userchoice == 'd' ) {
				
				double depositamt = Double.parseDouble( JOptionPane.showInputDialog( "Enter the amount to deposit" ) );
				useracct.deposit( depositamt );
				JOptionPane.showMessageDialog( null, "Deposit Successful\n\n" + useracct );
			}
			else {
				
				if( userchoice == 'w') {
					
					double withdrawamt = Double.parseDouble( JOptionPane.showInputDialog( "Enter amount to withdraw ") );
					if( useracct.withdraw( withdrawamt ) == true ) {
						
						JOptionPane.showMessageDialog( null,  "withdrawal Successful\n\n" + useracct );
						
					}
					else {
						
						JOptionPane.showMessageDialog( null, "Insufficient Funds\n\n" + useracct );
						
					}
					
				}
					else {
						// user want to view acct details.
						
						JOptionPane.showMessageDialog( null, useracct );
						
				
				}
				
				
			}//ends if statement
			
			userchoice = showMenu( );
			
		}//ends while loop
		
		
	} //ends main method
		
		public static char showMenu() {
			
			String mainmenu = "Please Select an Option\n\n\n";
			mainmenu += "(L)ogin into account\n\n";
			mainmenu += "(Q)uit program\n\n";
			
			return JOptionPane.showInputDialog( mainmenu ).charAt( 0 );
			
			
			
		}
		
		
		
		
		
		
		
		
	}//ends class
