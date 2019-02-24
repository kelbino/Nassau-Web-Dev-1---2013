import javax.swing.*;

public class ElectionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Candidate Vermin = new Candidate (" Vermin Supreme");
		Candidate Robby = new Candidate (" Robby Wells");
		Candidate Josue = new Candidate ("Jouse Larose");

		/*	String mainmenu = "Please Select a Candidate\n";
		mainmenu += "\n(0) To exit Ballot";
		mainmenu += "\n(1) Vermin Supreme";
		mainmenu += "\n(2) Robby Wells";
		mainmenu += "\n(3) Josue Larose";

		JOptionPane.showInputDialog( mainmenu );
		 */
		int ballotChoice = menuMethod();


		while( ballotChoice != 0 ){

			if( ballotChoice == 1 ){

				Vermin.addVotes();


			}// 1st if
			else if( ballotChoice == 2 ){

				Robby.addVotes();


			}// 2nd if
			else  if( ballotChoice == 3){

				Josue.addVotes();


			}// 3rd if
			else if( ballotChoice == -1){

				Vermin.removeVotes();

			}// 4th if
			else if( ballotChoice == -2){

				Robby.removeVotes();


			}// 5th if
			else if( ballotChoice == -3){

				Josue.removeVotes();

			}
			else {

				JOptionPane.showMessageDialog(null, " Please select a candidate by choosing 1, 2, or 3");//last if
			}


			ballotChoice = menuMethod();


		}//end while loop

		String results = "Voters Results\n____________\n\n\n";
		results += Vermin +"\n";
		results += Robby +"\n";
		results += Josue +"\n";

		JOptionPane.showMessageDialog( null, results);





		if( ( Vermin.getNumVotes() > Robby.getNumVotes() && Vermin.getNumVotes() > Josue.getNumVotes() ) ) {

			JOptionPane.showMessageDialog(null, "Vermin Supreme Wins The Election");
		}
		else if( ( Robby.getNumVotes() > Vermin.getNumVotes() && Robby.getNumVotes() > Josue.getNumVotes() ) ) {			

			JOptionPane.showMessageDialog(null, "Robby Wells Wins The Election");
		}
		else {

			JOptionPane.showMessageDialog(null, "Josue Larose Wins The Election");
		}

	}//end main
	public static  int menuMethod(){
		String mainmenu = "Please Select a Candidate\n";
		mainmenu += "\n(0) To exit Ballot";
		mainmenu += "\n(1) Vermin Supreme";
		mainmenu += "\n(2) Robby Wells";
		mainmenu += "\n(3) Josue Larose";

		return Integer.parseInt(JOptionPane.showInputDialog( mainmenu ));
	}
}//end class
