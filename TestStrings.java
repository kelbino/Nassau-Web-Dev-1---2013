import javax.swing.*;

public class TestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = JOptionPane.showInputDialog( "Enter word 1" );
		String word2 = JOptionPane.showInputDialog( "Enter word 2" );
		
		if( word1.equals( word2 ) == true ) {
			
			JOptionPane.showMessageDialog(null,  "Words are the same" );
			
		}
		else {
			
			JOptionPane.showMessageDialog( null, "Words are NOT the same" );
			
		}
		
		
		
		
	}

}
