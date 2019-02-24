import javax.swing.*;

public class TestDVDCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int size = Integer.parseInt( JOptionPane.showInputDialog( "Enter collection size" ) );
		
		DVDcollection collection1 = new DVDcollection( size );
		
		for( int i = 1; i <= size; i++ ) {
			
			String title = JOptionPane.showInputDialog( "Enter title od DVD " + i );
			String genre = JOptionPane.showInputDialog( "Enter genre of DVD " + i );
			String cost = JOptionPane.showInputDialog( "Enter cost of DVD " + i );
			
			collection1.addDVD( new DVD( title, genre, new Money( cost ) ) ); //anonymous variable representation
			
			
			
			
		}//ends for loop
		
		JOptionPane.showMessageDialog( null,  collection1 );
		
	}// ends main

}//ends class
