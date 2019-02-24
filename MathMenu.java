import javax.swing.*;

public class MathMenu {

	public static void main(String[] args) {

		//get the 3 numerical inputs from user. Do not worry about data testing these as there is nothing to data test for

		int num1 = Integer.parseInt( JOptionPane.showInputDialog( "Enter num 1") );
		int num2 = Integer.parseInt( JOptionPane.showInputDialog( "Enter num 2") );
		int num3 = Integer.parseInt( JOptionPane.showInputDialog( "Enter num 3") );


		// show initial menu. User will give first menu choice
		// we will either quit or handle their choice

		char menuchoice = showMenu();
		//will ask for users choice


		while( menuchoice != 'q'){

			//user did not enter a 'q', so deal with it
			if( menuchoice == 'a' ){
				//we will add the numbers

				int sum = NumberTools.findSum( num1, num2, num3 );
				//to call another function/method you must put ".class.method()"
				
				
			}
			else {
				if(menuchoice == 'v') {

					//we will average the numbers

					double avg = NumberTools.findAvg(
				}
				else {

					JOptionPane.showMessageDialog( null, "Invalid menu option, knucklehead");
				}

			}
			menuchoice = showMenu();

		}


	}//ends main

	public static char showMenu() {

		String menumsg = "Choose an option\n\n";
		menumsg += " (a)dd numbers \n";
		menumsg += "a(v)erage numbers\n";
		menumsg += " (q)uit\n\n";

		return JOptionPane.showInputDialog( menumsg ).charAt(0);
		//.charAt(0) is the first character of whatever the user inputs



	}


}




