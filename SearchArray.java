import javax.swing.*;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an array of ints and populate
		int[] numlist = { 100, 17, 21, 11, 18, 21, 4, 16, 14, 20, 85, 90};
		String msg = "";
		int searchnum = Integer.parseInt( JOptionPane.showInputDialog( " Enter number to search ") );
		boolean numfound = false;

		//perform a linear search to find element in array

		for( int i = 0; i < numlist.length; i++ ) {

			if( searchnum == numlist[ i ] ) {

				msg += searchnum + " was found at position " + i + "\n";
				numfound = true;

				}
			
		}//ends loop

			if( numfound == false) {

				msg += "Sorry, " + searchnum + " was not found" + "\n";
			
			}
			
			
			JOptionPane.showMessageDialog( null, msg );	
			
		}	//ends main method


	}


