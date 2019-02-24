import javax.swing.*;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] username = {"summer", "vacation", "fun", "school", "graduation"};
		String[] password = {"time", "time", "time", "time", "time", "time"};
		int[] logins = {0, 0, 0, 0, 0};
		
		String mainmenu = "Please Select an Option\n\n\n";
		String select = "";
		
		String name = "";
		String pass = "";
		
		mainmenu += "(L)ogin into account\n\n";
		mainmenu += "(Q)uit program\n\n";
		
		
				
		//String ans = JOptionPane.showInputDialog( null, "fikdgigjfjgfij" );
		
		//System.out.println(ans);
		
		
		select = JOptionPane.showInputDialog( null, mainmenu );
		
		while ( select.equals("Q") != true ) {//while opens
							
				if(select.equals( "L" ) == true) { //if opens
					
					name = JOptionPane.showInputDialog( null, "Please enter your username" );
					
					pass = JOptionPane.showInputDialog( null, "Please enter your password" );
					
					
				}//if closes
				
				for( int i = 0; i < username.length; i++) {
					
					int nums = 0 + 1;
					String msg = " You are Now logged in \n\n";
					msg += "You have logged in " + nums + " time(s). ";
					
					
					
					if( username[ i ].equals(name)  && ( password[ i ].equals(pass) ) ) {
						
						JOptionPane.showMessageDialog( null, msg );
						
						
											
					}
					else{
						
						JOptionPane.showMessageDialog( null,  "Incorrect Login, Please Try Again!");
						
						select = JOptionPane.showInputDialog( null, mainmenu );
												
					}
					
					
				}
				
				select = JOptionPane.showInputDialog( null, mainmenu );
				
				
			}//while closes
			
			
		}// end method
	
}// end class
				
		
		
