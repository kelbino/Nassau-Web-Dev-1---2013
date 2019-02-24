import javax.swing.*;

public class BowlingProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score1 = getScore("Enter score 1");				
		int score2 = getScore("Enter score 2");
		int score3 = getScore("Enter Score 3");
		
		//perform calculation
		
		int avg = (int)Math.round( (score1 + score2 + score3) / (double)3 );
		//cast the (int) to Math.round so score1 score2 & score3 are integers and cast (double) for 3 so it becomes in decimal
		
		
		//produce output
		
		String msg = "Score 1 is " + score1 + "\n";
		//**reminder** "\n" is a line break
		msg += "Score 2 is " + score2 + "\n";
		msg += "Score 3 is " + score3 + "\n";
		msg += "Your average is " + avg;
		
		//print to JoptionPane
		JOptionPane.showMessageDialog( null, msg );
		
	}//ends main
	
	//method to get valid score from user
	
	public static int getScore( String scoremsg ) {
		
		int tempscore = Integer.parseInt( JOptionPane.showInputDialog( scoremsg ) );
		
		while( tempscore < 0 || tempscore > 300) {
			
				tempscore = Integer.parseInt( JOptionPane.showInputDialog( "Score out of range\nEnter score again") );
		}
		
		return tempscore;
		
		
	}//ends getScore() method
		
		

}// ends class
