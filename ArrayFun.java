import javax.swing.*;

public class ArrayFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arraysize = Integer.parseInt( JOptionPane.showInputDialog( "Enter size of array" ) );
		
		int[] numlist = new int[arraysize];
		
		// the []'s let's java know that you are using an array.
		//example String[] namelist = new String[10]; means the String
		//the number inside the brackets tell you how many Stings, chars, doubles, integers, or booleans in it
		// new - allocate more memory
		
		//populate the array with user input
		
		for( int i = 0; i < numlist.length; i++) {
			
			numlist[ i ] = Integer.parseInt( JOptionPane.showInputDialog( "Enter Value for position " + i  ) );
			
		}
		
		// print all elements into one JOption box
		String msg = "";
		for( int i = 0; i < numlist.length; i++) {
			
			msg += numlist[ i ] + "\n";
			
			
		}
		
		JOptionPane.showMessageDialog( null, msg );
		
		//add all values of array. Print the sum and the average
		
		int sum = 0;
		for( int i = 0; i < numlist.length; i++) {
			
			sum += numlist[ i ];
			
			msg = "Sum of the arrays are " + sum + "\n";
			double avg = sum / (double) numlist.length;
			msg += "Average is " + avg;
			JOptionPane.showMessageDialog( null ,  msg);
			
			
		}
		
		//find and print the maximum value of the array
		int max = numlist[ 0 ];
		for( int i = 1; i < numlist.length; i++) {
			
			if( numlist[ i ] > max){
				
				max = numlist[ i ];
			}
		}
		
		msg = "Maximum value of the array is " + max;
		
		
		JOptionPane.showMessageDialog( null, msg);
		
		
		
		
		

	}

}
