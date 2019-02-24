import javax.swing.*;

public class ExceptionGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 1;
		int count = 0;
		int sum = 0;
		
		while( grade != -1 ) {
			
			try {
				
				grade = Integer.parseInt( JOptionPane.showInputDialog( "Enter grade ( -1 to exit )") );
				
				if( grade < -1 || grade > 100 ) {
					
					throw new GradeOutOfRangeException();
					
				}
				
				
				
				if( grade != -1 ){
					
					sum += grade;
					count++;
					
				}
				
				
			}//ends try
			
			catch ( NumberFormatException e ) {
				 JOptionPane.showMessageDialog(null, "Numerical values only");
				
				
			}
			
			catch( GradeOutOfRangeException e ) {
				
				JOptionPane.showMessageDialog( null, e );
				
			}
			
		}//ends while
		
		try {
			
		double avg = sum / count;
		JOptionPane.showMessageDialog( null, "Average is " + avg );
		
		}
		catch( ArithmeticException e ) {
			JOptionPane.showMessageDialog( null, "No no grades were entered");
			
		}
	}//ends main

}//ends class
