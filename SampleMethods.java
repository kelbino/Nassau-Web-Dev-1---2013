import javax.swing.*;

public class SampleMethods {
	
	public static void main(String[] args ) {
		
		double num1 = Double.parseDouble( JOptionPane.showInputDialog( "Enter num 1") );
		double num2 = Double.parseDouble( JOptionPane.showInputDialog( "Enter num 2") );
		
		double max = findMax( num1, num2 );
		
		JOptionPane.showMessageDialog( null,  "Max value is" + max );
		
	}//ends main
	
	public static int findMax( int x, int y) {
		
		if( x > y)
			return x;
		else
			return y;
		
		
	}
	
	public static double findMax( double x, double y) {
		
		if( x > y)
			return x;
		else
			return y;
		
	}

}
