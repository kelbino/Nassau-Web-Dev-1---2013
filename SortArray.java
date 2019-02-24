import javax.swing.*;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numlist = { 100, 80, 50, 30, 90, 0, 40, 70, 20, 60, 10 } ; 
		
		//print pre-sorted array using a separate
		//we will use this method again to print post sorting
		
		printArray( numlist );//argument
		
		//sort the array using a bubble sort technique
		for(int i = 0; i < numlist.length; i++ ){
			//in this loop, we define another loop
			// that will through the array and compare and move values if necessary
			
			for( int j = 1; j < numlist.length; j++ ) {
				
				if( numlist[ j ] < numlist[ j - 1] ) {
					
					int temp = numlist[ j ];
					numlist[ j ] = numlist[ j - 1 ];
					numlist[ j - 1 ] = temp;
					
				}
				
				
			}//ends inner for loop
			
			printArray( numlist ); //displays the movement of arrays
			
			
			
		}//ends outer for loop
		
		//printArray( numlist ); will display the end results of the arrays
		
	}// ends main method
	
	
	public static void printArray( int[] nums ) {//parameter
		
		String msg = "";
		
		for( int i = 0; i < nums.length; i++ ) {
			
			
			msg += "Position " + i + " is " + nums[ i ] + "\n";
			
			
		}
		
		JOptionPane.showMessageDialog( null,  msg );;
	}
	
}// ends class
