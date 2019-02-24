import javax.swing.*;
//Kelvin H Salvodon ITE 204 summer program
public class Homework2 {

	public static void main(String[] args) {

		double far = getFahrenheit("Please enter a Degree");
		double cel = calcCelsius( far );
		int i;


		String msg = "Fahrenheit is " + far + "\n\n";
		msg = msg + "Celcsius is " + cel + "\n\n";


		for(i = 32; i <= 50; i= i + 1){
			msg = msg + "Fahrenheit: " + i +"\n";
			msg = msg + "Celsius: " + 5.0 / 9.0 * (i + 1 - (double)32) +"\n";
			
		}



		JOptionPane.showMessageDialog( null, msg);

	}

	public static double getFahrenheit( String degree){

		double degr = Double.parseDouble( JOptionPane.showInputDialog( degree) );

		while (degr < 0 || degr > 100) {

			degr = Double.parseDouble( JOptionPane.showInputDialog( "The degree entered is out of Range\nPlease enter a degree between 0 & 100\n") );


		}
		return degr;
	}

	public static double calcCelsius(double far ) {

		return  5.0 / 9.0 * ( far - 32 );


	}

}
